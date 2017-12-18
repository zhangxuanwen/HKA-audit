package com.sma.dto;

import java.util.Map;

public class IPInterceptorDto {

	private long id;
	private String ipAddr;
	private String targetName;
	private String checkResult;
	private String requestTime;
	private long dealTime;
	private Map<String,String[]> paramMap;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIpAddr() {
		return ipAddr;
	}
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	public String getTargetName() {
		return targetName;
	}
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}
	public String getCheckResult() {
		return checkResult;
	}
	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}
	public String getRequestTime() {
		return requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}
	public long getDealTime() {
		return dealTime;
	}
	public void setDealTime(long dealTime) {
		this.dealTime = dealTime;
	}
	public Map<String,String[]> getParamMap() {
		return paramMap;
	}
	public void setParamMap(Map<String,String[]> paramMap) {
		this.paramMap = paramMap;
	}
	
}
