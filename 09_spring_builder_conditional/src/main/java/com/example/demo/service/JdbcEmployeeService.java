package com.example.demo.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

import com.example.demo.conditionals.FirstCondition;

@Service
@ConditionalOnProperty(name="spring.application.name",havingValue = "bajaj")
//@Conditional(FirstCondition.class)
public class JdbcEmployeeService implements EmployeeService {

	
	public JdbcEmployeeService() {
		System.out.println("JdbcEmployeeService instantiated");
	}
	
	@Override
	public String getEmployees() {
		
		return "Meena,Githa,Seetha,Rita";
	}
}
