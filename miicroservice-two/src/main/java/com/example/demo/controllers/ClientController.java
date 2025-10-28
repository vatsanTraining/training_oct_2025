package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/api/v1/clients")
public class ClientController {

	
	private RestClient client;
	

	private RestTemplate templateClient;

	public ClientController(RestClient client,RestTemplate templateClient) {
		super();
		this.client = client;
		this.templateClient =templateClient;
	}
	

	
	
	@GetMapping
	public String getMessge() {
		
		return this.client.get().uri("/first")
				 .retrieve().body(String.class);
		
	}
	
	
	@GetMapping(path = "/templateway")
	public String getMessgeUsingRestTemplate() {
		
		return templateClient.getForObject("http://MICROSERVICE-ONE/first", String.class);
	}
	
	
}





