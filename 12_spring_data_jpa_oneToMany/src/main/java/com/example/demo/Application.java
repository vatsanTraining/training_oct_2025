package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.services.BiDirOrderService;
import com.example.demo.services.OrderService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext  ctx=SpringApplication.run(Application.class, args);
	
	
	//OrderService service = ctx.getBean("orderService",OrderService.class);
	
	BiDirOrderService service = ctx.getBean("biDirOrderService",BiDirOrderService.class);
	
	//service.addTOrderBook();
	
	//System.out.println("Open the MySql work Bench and observe ");
	
	
	
	
	service.addTOrderBook();

	service.print();

	}

}
