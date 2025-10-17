package com.example.demo;

import com.example.demo.service.EmployeeService;
import com.example.demo.service.InMemoryEmployeeService;
import com.example.demo.service.JdbcEmployeeService;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		
		ConfigurableApplicationContext ctx= new SpringApplicationBuilder(Application.class)
				      .bannerMode(Banner.Mode.OFF).properties("server.port:4040")
				      .run(args);
		
		
		
		System.out.println(ctx.getBean(EmployeeService.class).getEmployees());
		
		
		
		ctx.close();
		
	}
	
	
	   

}
