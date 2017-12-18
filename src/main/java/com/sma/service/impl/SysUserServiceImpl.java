package com.sma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sma.entity.SysUser;
import com.sma.mapper.SysUserMapper;
import com.sma.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService{
	
	@Autowired
	public SysUserMapper suMapper;
	
	@Override
	public List<SysUser> getAllSysUsers() {
		// TODO Auto-generated method stub
		return suMapper.getAllSysUsers();
	}

	@Override
	public List<SysUser> getLikeNameTest(String likeName) {
		// TODO Auto-generated method stub
		return suMapper.getLikeNameTest(likeName);
	}

	@Override
	public List<SysUser> getLikeName(String likeName) {
		// TODO Auto-generated method stub
		if(null != likeName && ! likeName.equals("")){
			likeName = '%' + likeName + '%';
		}
		return suMapper.getLikeName(likeName);
	}

	@Override
	public SysUser getById(long id) {
		// TODO Auto-generated method stub
		return suMapper.getById(id);
	}

	@Override
	public String getLoginNameById(long id) {
		// TODO Auto-generated method stub
		return suMapper.getLoginNameById(id);
	}

}
