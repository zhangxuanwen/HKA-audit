package com.sma.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.sma.dto.IPInterceptorDto;

@Service
public interface IPInterceptorService {
	
	String ipAllowed(IPInterceptorDto dto);
	
	long saveRequestRecord(IPInterceptorDto rr, Map<String,String[]> paramMap);
	
	void updateDealTime(long executeTime, long rrID);
	
	String testIP();

}
