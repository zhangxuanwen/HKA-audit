package com.sma.service;

import java.util.List;

import com.sma.entity.SysUser;

public interface SysUserService {

	//增删改查
	
	
	
	List<SysUser> getAllSysUsers();
	
	List<SysUser> getLikeName(String likeName);
	
	List<SysUser> getLikeNameTest(String likeName);
	
	SysUser getById(long id);
	
	String getLoginNameById(long id);
}
