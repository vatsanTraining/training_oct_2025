package com.example.demo.module.three;
import java.util.*;

import com.example.demo.execeptions.ElementAleadyExistException;
import com.example.demo.execeptions.NotFoundException;
import com.example.demo.module.three.services.EmployeeService;
import com.example.demo.module.three.utils.EmployeeUtils;
public class EmployeeApplication {

	
	public static void print(Collection<Employee> empList) {
		
		
		Iterator<Employee> itr = empList.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}
	
	
	public static void main(String[] args) {

		
		EmployeeService service = new EmployeeService(new EmployeeRepoImpl());
		

		int key =1;

	try {
		
		
		switch (key) {
		case 1:
			
			System.out.println("Is Added :=>"+service.save(new Employee(1010, "Ganesh", "Chennai", 89000)));  ;
			System.out.println("Is Added :=>"+service.save(new Employee(1020, "Kumaresh", "Pune", 79000)));  ;
			System.out.println("Is Added :=>"+service.save(new Employee(1030, "Rakesh", "Satara", 99000)));  ;
			
			//break;
		case 2:
			print(service.findAll());
			//break
		case 3:
			System.out.println("Found"+service.findById(1010));
			System.out.println("Found"+service.findById(2010));
			
             break;
		case 4:
			service.sortByLocation(EmployeeUtils.comparatorFactory(1));
            break;
		case 5:
			service.sortByLocation(EmployeeUtils.comparatorFactory(2));
            break;
		default:
			break;
		}
		
		
		
	} catch (ElementAleadyExistException | NotFoundException e) {
		e.printStackTrace();
	}
	
		
		
		
	}

}
