package com.sma.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sma.dto.IPInterceptorDto;
import com.sma.entity.RequestParams;

@Mapper
public interface IPInterceptorMapper {
	
	String checkIsAllowed(IPInterceptorDto ipDto); 

	void insertRequestRecord(IPInterceptorDto rr);
	
	void insertRequestParamsList(List<RequestParams> rplist);
	
	void updateDealTimeByRRID(IPInterceptorDto rr);
}
