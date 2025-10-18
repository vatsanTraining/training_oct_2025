package com.example.demo.services;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class TextileOrderImpl implements OrderDetails {

	@Override
	public List<String> getOrderDetails() {
		
		return List.of("PRODUCTION =>Pant","Jeans","Polor Shirt","Sherwani");
		
		
	}

}
