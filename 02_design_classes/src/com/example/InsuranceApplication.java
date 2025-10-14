package com.example;

import com.example.demo.Insurance;
import com.example.demo.LifeInsurance;
import com.example.demo.services.InsuranceService;

public class InsuranceApplication {

	
	public static Insurance insuranceFactory(int key) {
		
		switch (key) {
		case 1:
			
			return new LifeInsurance();
		case 2:
			return new VechicleInsurance();
			
		default:
			return null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		InsuranceService service = new InsuranceService();
		
		 service.findPremium(insuranceFactory(1));
		
		 service.findPremium(insuranceFactory(2));
		 
	}

}
