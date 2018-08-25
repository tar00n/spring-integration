package com.tarungarg.springintegration.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("spring-int")
public class StartupController {

	@RequestMapping(method = RequestMethod.POST)
	public void printText() {
		
	}
	
}
