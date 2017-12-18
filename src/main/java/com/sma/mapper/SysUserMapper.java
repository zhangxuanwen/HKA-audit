package com.sma.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sma.entity.SysUser;

@Mapper
public interface SysUserMapper {

//	@Select("select * from sys_user")
	List<SysUser> getAllSysUsers();
	
	List<SysUser> getLikeName(String likeName);
	
	List<SysUser> getLikeNameTest(String likeName);
	
	SysUser getById(long id);
	
	String getLoginNameById(long id);
}
