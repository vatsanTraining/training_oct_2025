package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/first")
public class FirstController {

	
	
	@GetMapping
	public String getMessage() {
		
		return "I am From First Controller";
	}
}
