package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.Master;

@Configuration
public class AppConfig {

	
	
	@Bean
	public Master master() {
		
		return new Master();
	}
}
// Compare this snippet from MasterService.java: