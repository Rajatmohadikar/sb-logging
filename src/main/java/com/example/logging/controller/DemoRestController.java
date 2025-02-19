package com.example.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	Logger logger = LoggerFactory.getLogger(DemoRestController.class);	
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		logger.info("get welcome message execution started");
		
		String msg = "Welcome to Rajat tech..";
		
		logger.info("get welcome message execution ended");
		return msg;
	}
}
