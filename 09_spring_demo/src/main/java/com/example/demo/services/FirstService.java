package com.example.demo.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Lazy   // Beans are Eagerly Initialised , by adding @Lazy it can be lazy Initialised

@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FirstService {
	
	
	public FirstService() {
		System.out.println(" First Service Instantiated ==============>");
	}
	
	
	public String getInfo() {
		
		return " I am From First Service";
	}
}
