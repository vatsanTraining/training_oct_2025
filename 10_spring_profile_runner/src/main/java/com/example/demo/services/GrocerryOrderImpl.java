package com.example.demo.services;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class GrocerryOrderImpl implements OrderDetails {

	@Override
	public List<String> getOrderDetails() {

		return List.of("DEV ->Milk","Sugar","Jaggery","Koava");
	}

}
