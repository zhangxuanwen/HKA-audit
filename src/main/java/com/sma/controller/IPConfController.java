package com.sma.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sma.dto.IPInterceptorDto;
import com.sma.service.IPInterceptorService;

@RestController
@RequestMapping("/ipInter")
public class IPConfController {

	@Autowired
	private IPInterceptorService ipService;
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/ifIPAllowed", method = RequestMethod.POST)
	public String ifIPAllowed(@RequestBody IPInterceptorDto ipDto){
		log.info("~~~IPConfController.ifIPAllowed~~~");
		String result = ipService.ipAllowed(ipDto);
		log.info("~~~ifAllowed result:" + result + "~~~");
		return result;
	}
	
	@RequestMapping(value = "/saveRequestRecord", method = RequestMethod.POST)
	public long saveRequestRecord(@RequestBody IPInterceptorDto ipDto){
		log.info("~~~IPConfController.saveRequestRecord~~~");
		Map paramMap = ipDto.getParamMap();
		long rrID = ipService.saveRequestRecord(ipDto, paramMap);
		log.info("~~~saveRequestRecord rrID:" + rrID + "~~~");
		return rrID;
	}
	
	@RequestMapping(value = "/updateDealTime", method = RequestMethod.GET)
	public String updateDealTime(String executeTime, String rrID){
		log.info("~~~IPConfController.updateDealTime~~~");
		ipService.updateDealTime(Long.parseLong(executeTime), Long.parseLong(rrID));
		return null;
	}
}
