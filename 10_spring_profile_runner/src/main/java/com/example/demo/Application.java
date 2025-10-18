package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.services.OrderDetails;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
	 ConfigurableApplicationContext ctx=SpringApplication.run(Application.class, args);
		
		  
//		  ConfigurableApplicationContext ctx=new SpringApplicationBuilder(Application.class)
//			    .profiles("dev","prod").run(args);
//			
		  
		  ctx.getBean(OrderDetails.class).getOrderDetails().forEach(System.out::println);
		  
		  
		  ctx.close();
	}

	
	
	@Bean
	CommandLineRunner runner() {
		
		return args->{
			
			System.out.println("Inside runner .....");
			
			for(int i=0;i<args.length;i++) {
				System.out.println("args:=>" +args[i]);
			}
		};
	}
}
