package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@ConfigurationProperties(prefix="com.example.demo")
public class OrderManager {

	
	private OrderDetails details;
	
	private String custom;
	
	
	public void setCustom(String custom) {
		this.custom = custom;
	}

	@Autowired
	private Environment env;
	
	

	
	public OrderManager(OrderDetails details) {
		
		this.details = details;
		
		
		System.out.println("inside constructor" +env);
	}
	
	
	@PostConstruct
	public void init() {
		
		System.out.println("inside init"+env);
		System.out.println("Inside :=>"+custom);
		
	}
	
	public List<String> getDetails(){
		

		return this.details.getOrderDetails();
	}
	
	@PreDestroy
	public void closeDown() {
		
		System.out.println("Shutting Down .......");
	}
}
