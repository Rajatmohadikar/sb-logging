package com.example.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	Logger logger = LoggerFactory.getLogger(GreetController.class);	

	@GetMapping("/greet")
	public String getGreetMesg() {
		logger.info("getGreetMesg() execution started...");
		String msg = "Good evening";
		logger.info("getGreetMesg() execution ended...");

		return msg;
	}

}
