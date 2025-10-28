package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class MiicroserviceTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiicroserviceTwoApplication.class, args);
	}

	
   @Bean
   @LoadBalanced
   RestClient.Builder builder() {
		
		return RestClient.builder();
		
	}
	

	@Bean
	   RestClient client(RestClient.Builder builder) {
			
			return builder.baseUrl("http://MICROSERVICE-ONE").build();
			
		}

	
	
	@Bean
	@LoadBalanced 
	RestTemplate templateClient() {
		
		return new RestTemplate();
	}
	
}
