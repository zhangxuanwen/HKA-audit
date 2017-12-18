package com.sma.entity;

public class RequestParams {

	private long id;
	private long rrID;
	private String rparam;
	private String rvalue;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRrID() {
		return rrID;
	}
	public void setRrID(long rrID) {
		this.rrID = rrID;
	}
	public String getRparam() {
		return rparam;
	}
	public void setRparam(String rparam) {
		this.rparam = rparam;
	}
	public String getRvalue() {
		return rvalue;
	}
	public void setRvalue(String rvalue) {
		this.rvalue = rvalue;
	}	
}
