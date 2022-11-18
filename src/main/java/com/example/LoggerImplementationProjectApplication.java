package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.LoggerDAO;
import com.example.service.LoggerService;

@SpringBootApplication
public class LoggerImplementationProjectApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(LoggerImplementationProjectApplication.class, args);
		
		LoggerService loggerService=new LoggerService();
		loggerService.greetFromIT();
		loggerService.welcomeMessage();
		
		LoggerDAO dao=new LoggerDAO();
		dao.getName(101);
	}

}
