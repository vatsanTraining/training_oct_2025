package com.example.demo.utils;

import org.springframework.data.jpa.domain.Specification;
import com.example.demo.entity.*;
public class CustomSpecs {

	
	public static Specification<Customer> findByCustomerName(String name){
		
		
		return (root,criteria,builder) ->{
			
			
			return builder.like(root.get("customerName"), "R%");

			//return builder.equal(root.get("customerName"),name);
			
		};
	}
}
