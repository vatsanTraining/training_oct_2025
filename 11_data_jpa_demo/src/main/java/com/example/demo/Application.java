package com.example.demo;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.AddressDto;
import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;
import com.example.demo.entity.CustomerType;
import com.example.demo.services.CustomerService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		Logger log = Logger.getLogger("main");
		
	  ConfigurableApplicationContext	ctx= SpringApplication.run(Application.class, args);
	  
	    CustomerService service = ctx.getBean("customerService",CustomerService.class);
//	    
//	    CustomerDto toAdd = ctx.getBean("sample",CustomerDto.class);
	    
//	    CustomerDto dto = service.save(toAdd);
//	    
//	  
//	     CustomerDto dto2 = ctx.getBean("anotherDto",CustomerDto.class);
//	     
//	  
//	    log.info("One Entity With id"+dto.customerId() +"Added");
//	    
	    
	    service.findAll().forEach(System.out::println);
	    
	    ctx.close();
	    
	    
	}

	
	@Bean
	Customer customer() {
		
		return new Customer();
	}
	
	@Bean
	AddressDto dtOne() {
		
		return new AddressDto("Gandhi Street","Nehru Nagar","indirapuri",848484);
	}
	
	@Bean
	AddressDto dtTwo() {
		
		return new AddressDto("Shivaji Street","Sambaji Nagar","Peshwapuri",948484);
	}
	
	@Bean
	CustomerDto sample(AddressDto dtOne, AddressDto dtTwo) {
		
		return new CustomerDto(4010,"Kiran", 998020301, "kiran3@abc.com", CustomerType.RETAIL,dtOne,dtTwo);
	}
	
	@Bean
	CustomerDto anotherSample(AddressDto dtOne, AddressDto dtTwo) {
		
		return new CustomerDto(5020,"Deepika", 778030301, "deeps03@abc.com", CustomerType.CORPORATE,dtOne,dtTwo);
	}
	
	@Bean
	CustomerService oneMore(JpaRepository<Customer, Integer> repo) {
		
		return new CustomerService(repo);
	}
//	@Bean
//	CustomerDto anotherDto(CustomerDto anotherSample,CustomerService oneMore) {
//		
//	
//		return oneMore.save(anotherSample);
//		 
//		 
//	}
}
