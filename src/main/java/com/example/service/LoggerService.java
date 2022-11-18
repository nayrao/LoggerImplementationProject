package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerService {
	
	private static final Logger logger  =  LoggerFactory.getLogger(LoggerService.class);
	
	public String welcomeMessage() {
		logger.info("inside of the  welcomeMessage():");
		return "welcome to AshokIT Technology";
		
	}
	public String greetFromIT() {
		logger.info("inside of the  greetFromIT():");
		return "Good Morning!";
	}

}
