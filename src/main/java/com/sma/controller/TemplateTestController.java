package com.sma.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.sma.entity.SysUser;
import com.sma.service.SysUserService;

@Controller
public class TemplateTestController {

	@Autowired
	private SysUserService suService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/testTemplate")
	public String Hello(Map<String,Object> map){
		map.put("hello", "test thymeleaf template!");
		//return后面双引号中的名字要和html的名字一样
		return "/HelloWorld";
	}

	@RequestMapping("/template/allSysUser")
	public String getAllSysUsers(Map<String,Object> map){
		logger.info("~~Test template getAllSysUsers~~");
		
		List<SysUser> result = new ArrayList<SysUser>();
		result = suService.getAllSysUsers();
		map.put("results", result);
		map.put("title", "ALL USERS!");
		
		return "/SysUserShow";
	}
}
