package com.example.demo;

import org.demo.Dummy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

import com.example.demo.model.Student;
import com.example.demo.services.FirstService;
import com.example.demo.services.SecondService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo","org.demo"})
public class Application {

    
	
	public static void workingOfIoc(ConfigurableApplicationContext ctx) {
		
		System.out.println("Context Class Name" +ctx.getClass().getName());
		
		FirstService service  = ctx.getBean(FirstService.class);
		
		
		System.out.println(service.getInfo());
		
		System.out.println("Hash Code:=>" +service.hashCode());
		
		System.out.println("is Singleton:=>"+ctx.isSingleton("firstService"));
		
		System.out.println("is prototype:=>"+ctx.isPrototype("firstService"));

		FirstService service2 =(FirstService)ctx.getBean("firstService");
		
				System.out.println(service2.getInfo());
				
				
				System.out.println("Hash Code:=>" +service2.hashCode());
				
				

	}
    
	public static void main(String[] args) {
	
		
	ConfigurableApplicationContext ctx	=SpringApplication.run(Application.class, args);
	
	//workingOfIoc(ctx);


	     SecondService service = ctx.getBean(SecondService.class);
	     
	   
	     service.getNames().forEach(System.out::println);
	     
	     
	     System.out.println("Best Student :=>"+service.getBestStudent());
	     
	     System.out.println("Next Best Student"+ service.getNextBestStudent());
	     
	     
	     System.out.println(ctx.getBean(Dummy.class).message());
	     
	     
	ctx.close();
	}

	
	@Bean
	String alpha() {
		
		return "Abishek";
	}
	
	@Bean
String beta() {
		
		return "Baskar";
	}


	@Bean
String gama() {
	
	return "Chandan";
}
	
	
	@Bean
	@Primary
	Student dravid() {
		
		return new Student(1010, "Dravid", 89);
	}
}
