package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;

@Configuration
public class WebConfig {

	
	
	 @Bean
	 ModelAndView mdlView() {
		
		return new ModelAndView();
	}
	 
	 
	 @Bean
	 CustomerDto customer() {
		 
		 return new CustomerDto();
	 }
}
