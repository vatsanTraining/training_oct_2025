package com.example.demo.module.three.utils;

import java.util.Comparator;

import com.example.demo.module.three.Employee;

public class EmployeeUtils {

	
	
	public class NameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	
	public class SalaryComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
	}
	
	public class LocationComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
	}
	
	
	public static Comparator<Employee> comparatorFactory(int key){
		
		EmployeeUtils utils = new EmployeeUtils();
		
		switch (key) {
		case 1:
			
			return utils.new NameComparator();
		case 2:
			return utils.new SalaryComparator();
		case 3:
			return utils.new LocationComparator();
		default:
			return null;
		}
	}
}
