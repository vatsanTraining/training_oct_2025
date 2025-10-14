package com.example.demo.abstraction;

import java.time.LocalDate;

public class LifeInsurance extends Insurance {

	private LocalDate dateOfBirth;

	
	
	
	public LifeInsurance(int policyNumber, String policyHolderName, double policyAmount, LocalDate dateOfBirth) {
		super(policyNumber, policyHolderName, policyAmount);
		this.dateOfBirth = dateOfBirth;
	}




	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		return 100;
	}

	
	public String sayHello() {
		
		return " I am from subclass";
	}
}
