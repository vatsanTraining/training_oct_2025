package com.example.demo;

import java.time.LocalDate;

import com.example.demo.ifaces.Product;
import com.example.demo.ifaces.Taxable;


// override and provide a new implementation

public class MultiImplementCaseOne implements Product, Taxable {

	@Override
	public LocalDate getLastDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String discount() {
		
		return "15%";
	}

	
}

// override and use super keyword on the required interface
 class MultiImplementCaseTwo implements Product, Taxable {

	@Override
	public LocalDate getLastDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String discount() {
		
		return Taxable.super.discount();
	}

	
	
}
 
 
 // override and use both the method with super key word
 
  class MultiImplementCaseThree implements Product, Taxable {

		@Override
		public LocalDate getLastDate() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String showInfo() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String discount() {
			
			return Taxable.super.discount() +","+Product.super.discount() + "Which ever is less";
		}

		
	}