package com.example.demo.services;

import com.example.demo.Student;

public class StudentService {

	
	// Passing an Object to the method
	//For references to objects, copy of the reference is passed

	
	public static void showDetails() {
		
		//System.out.println(this.getClass().getName());
		
		System.out.println("Inside Show Details");
		
		// show();  cannot call instance method from static
	}
	
	public void show() {
		
		String city = "Pune";
		
		System.out.println("My Class Loader ;=>"+this.getClass().getClassLoader().getClass().getName());

		System.out.println("Class Loaders Parent:=>"+this.getClass().getClassLoader().getParent());

		System.out.println(city.getClass().getClassLoader());
		
		showDetails();  // can call static from instance
		
	}
	
	public Student assignGrade(Student student) {
		
		  
		student.setGrade(assignGrade(student.getMarkScored()));
				
		return student;
		
	}
	
	
	// Overloaded Method which takes the mark as argument
	
	
	
	public String assignGrade(int mark) {
		
//		String grade = "B";
//		
//		if(mark>80) {
//			grade ="A";
//		}
//		
//		return grade;
		
		return mark>80?"A":"B";
		
	}
	
	
}
