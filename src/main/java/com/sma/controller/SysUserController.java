package com.sma.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.sma.entity.SysUser;
import com.sma.mapper.SysUserMapper;
import com.sma.service.SysUserService;

@RestController
@RequestMapping("/user")
public class SysUserController {

	@Autowired
	private SysUserService suService;
	@Autowired
	private SysUserMapper suMapper;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/allSysUser")
	public List<SysUser> getAllSysUsers(){
		logger.info("~~Test getAllSysUsers~~");
		PageHelper.startPage(1, 4);
		return suService.getAllSysUsers();
//		return suMapper.getAllSysUsers();
	}
	
	@RequestMapping("/likeName")
	public List<SysUser> getLikeName(String name){//此处的参数是什么名字，浏览器访问时就要用那个名字传入参数
//		return suService.getLikeName(name);
		return suService.getLikeNameTest(name);
	}
	
	@RequestMapping("/getById")
	public SysUser getById(long id){
		return suService.getById(id);
	}
	
	@RequestMapping("/getLoginNameById")
	public String getLoginNameById(long id){
//		logger.info("~~Test getLoginNameById~~");
		return suService.getLoginNameById(id);
	}
	
}
