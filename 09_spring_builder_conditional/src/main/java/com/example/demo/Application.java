package com.example.demo;

import com.example.demo.service.EmployeeService;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

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
	
	
	   @Bean
	   String alpha() {
	        return "alpha";
	    }

}
