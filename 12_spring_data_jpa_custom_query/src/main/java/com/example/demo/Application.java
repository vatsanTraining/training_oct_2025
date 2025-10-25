package com.example.demo;
import com.example.demo.services.CustomerService;
import com.example.demo.services.MultiPartService;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat.Resource;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import com.example.demo.entity.Customer;
import com.example.demo.ifaces.CustomerRepository;

@SpringBootApplication
public class Application {

    private final CustomerService customerService;


    Application(CustomerService customerService) {
        this.customerService = customerService;
    }


	public static void main(String[] args) {
	ConfigurableApplicationContext	ctx = SpringApplication.run(Application.class, args);
	
	 
//	 ctx.getBean(CustomerService.class).findByCustomerName("Ramesh").forEach(System.out::println);
//	
//	 System.out.println("using Projectins Methods");
//	 
	 
	// ctx.getBean(CustomerService.class).findByCustomerNameWithProjection("Ramesh").forEach(System.out::println);

	// System.out.println(ctx.getBean(CustomerService.class).findByEmailWithProjection("ram@abc.com"));

	// System.out.println("rows updated :=>"+ctx.getBean(CustomerService.class).updateMobile(383838, 99999));
	
//	 System.out.println("Using Stream ========");
//	 
//	 
//	 ctx.getBean(CustomerService.class)
//	             .useStream(0)
//	                .entrySet()
//	                 .forEach(e -> System.out.println(e.getKey() + e.getValue()));
//	 
//	 
//	    MultiPartService service = ctx.getBean(MultiPartService.class);
//	    
//	    
//	    ClassPathResource imageRef = new ClassPathResource("logo.png");
//	    
//	    
//	       byte[] image=null;
//	       try(InputStream stream = imageRef.getInputStream()) {
//			
//	    	   image = stream.readAllBytes();
//	    	   
//	    	   service.saveImage("logo","img/png", image);
//	    	   
//	    	   System.out.println("One Image Saved");
//	    	   
//		} catch (Exception ex) {
//			 ex.printStackTrace();
//		}
	
	   //   ctx.getBean(CustomerService.class).findCustomerUsingSpec("Ramesh").forEach(System.out::println);
	 
	
	System.out.println("Page ----1");
	      ctx.getBean(CustomerService.class).usePagination(0, 2).forEach(System.out::println);
	      
	  	System.out.println("Page ----2");
	      
	      ctx.getBean(CustomerService.class).usePagination(1, 2).forEach(System.out::println);
	}

	
	
	@Bean
	Customer customer() {
		
		return new Customer(1002, "Ramesh", 3939392, "ram@abc.com");
		
	}
	
	
	@Bean
	CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			CustomerRepository repo;
			@Override
			public void run(String... args) throws Exception {
				
//				repo.save(new Customer("Ramesh",383838,"ram@abc.com"));
//				repo.save(new Customer("Ramesh",583838,"ram2@abc.com"));
//				repo.save(new Customer("Ramesh",683838,"ram3@abc.com"));
				
			}
		};
	}
	
}
