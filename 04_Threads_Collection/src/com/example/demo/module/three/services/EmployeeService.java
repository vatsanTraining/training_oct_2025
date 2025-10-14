package com.example.demo.module.three.services;

import java.util.*;

import com.example.demo.execeptions.ElementAleadyExistException;
import com.example.demo.execeptions.NotFoundException;
import com.example.demo.ifaces.EmployeeRepository;
import com.example.demo.module.three.Employee;

public class EmployeeService {

	
	
	private EmployeeRepository<Employee> repo;

	public EmployeeService(EmployeeRepository<Employee> repo) {
		super();
		this.repo = repo;
	}
	
	
	public Collection<Employee> sortByName(Comparator<Employee> nameComparator){
		
		
		return this.repo.sortedList(nameComparator);
	}
	
public Collection<Employee> sortByLocation(Comparator<Employee> locationComparator){
		
		
		return this.repo.sortedList(locationComparator);
	}


public boolean save(Employee employee) throws ElementAleadyExistException{
	
	 return this.repo.add(employee);
	
}


public Employee findById(int id) throws NotFoundException {
	return this.repo.findById(id);
}


public Collection<Employee> findAll() {
	// TODO Auto-generated method stub
	return this.repo.findAll();
}
	
}
