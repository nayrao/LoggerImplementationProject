package com.example.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDAO {
	
	private static final Logger logger  =  LoggerFactory.getLogger(LoggerDAO.class);
	
	public String getName(Integer Id) {
		String name=null;
		logger.info("getName() - method start");
		if(Id==100) {
			name="john"; 
			logger.info("100 method name:"+name );
		}
		else if(Id==101) {
			name="smith";
			logger.info("101 method name:"+name );
		}else {
			name="Invalid Name";
			logger.info("Invalid Name:"+name );
		}
		logger.info("getName() - method start");
		return name;
	}

}
