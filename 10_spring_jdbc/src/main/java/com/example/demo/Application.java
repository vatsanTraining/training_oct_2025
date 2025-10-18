package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.ifaces.MyDao;
import com.example.demo.services.DoctorService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext	 ctx=SpringApplication.run(Application.class, args);
	
	
	
	ctx.getBean(DoctorService.class).findAll().forEach(System.out::println);
	
	System.out.println(ctx.getBean(DoctorService.class).findById(1010));
	
	ctx.close();
	}


		
	
	
	@Bean
	CommandLineRunner cmdrunner() {
		
		return new CommandLineRunner() {
		
			@Autowired
			MyDao<Doctor> dao;
			
			
			@Override
			public void run(String... args) throws Exception {
				
				//dao.save(new Doctor(9999,"runner","run"));
			}
		};
	}
}