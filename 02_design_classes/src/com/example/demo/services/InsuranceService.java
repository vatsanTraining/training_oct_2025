package com.example.demo.services;

import com.example.demo.Insurance;

public class InsuranceService {

	
	
	public double findPremium(Insurance insurance) {
		
		return insurance.calculatePremium();
	}
}
