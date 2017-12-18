package com.sma.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sma.dto.IPInterceptorDto;
import com.sma.entity.RequestParams;
import com.sma.mapper.IPInterceptorMapper;
import com.sma.service.IPInterceptorService;

@Service
public class IPInterceptorServiceImpl implements IPInterceptorService{

	@Autowired
	public IPInterceptorMapper ipMapper;
	
	@Override
	public String ipAllowed(IPInterceptorDto ipDto) {
		// TODO Auto-generated method stub
		return ipMapper.checkIsAllowed(ipDto);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public long saveRequestRecord(IPInterceptorDto rr, Map<String,String[]> paramMap) {
		// TODO Auto-generated method stub
		if(null != rr) ipMapper.insertRequestRecord(rr);
		
		long rrID = rr.getId();
		
		List<RequestParams> paramList = new ArrayList<RequestParams>();
		
		for(String key : paramMap.keySet()){
			RequestParams rps = new RequestParams();
			String mapValue = paramMap.get(key)[0];
			rps.setRparam(key);
			rps.setRvalue(mapValue);
			paramList.add(rps);
		}
		
		if(null != paramList && paramList.size() > 0){
			for(RequestParams rp : paramList) rp.setRrID(rrID);
			ipMapper.insertRequestParamsList(paramList);
		}
		
		return rrID;
	}

	@Override
	public void updateDealTime(long executeTime, long rrID) {
		// TODO Auto-generated method stub
		IPInterceptorDto rr = new IPInterceptorDto();
		rr.setId(rrID);
		rr.setDealTime(executeTime);
		ipMapper.updateDealTimeByRRID(rr);
	}

	@Override
	public String testIP() {
		// TODO Auto-generated method stub
		return "test";
	}

}
