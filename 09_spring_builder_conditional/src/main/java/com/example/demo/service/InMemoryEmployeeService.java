package com.example.demo.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;


@Service
@ConditionalOnBean(Employee.class)
public class InMemoryEmployeeService implements EmployeeService {

	
	
	public InMemoryEmployeeService() {
		System.out.println("InMemoryEmployeeService instantiated");
	}
	
	public String getEmployees() {
		
		return "Ram,Shyam,Ganesh,Suresh";
	}
}
