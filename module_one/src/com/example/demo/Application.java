package com.example.demo;
import java.sql.*;
import java.util.logging.*;

import com.training.Status;
import com.training.records.CreditCard;
import com.training.records.Student;
public class Application {

	
	public static void switchCaseVersionOne(String choice) {
	
	  String result =	switch (choice) {
	  case "student" -> "Best Student is Ram";
	  case "employee" -> "Best Employee is Shyam";
		default->
			throw new IllegalArgumentException("Unexpected value: " + choice);
	  };
	  System.out.println(result);
	}
	
	public static void switchCaseWithExpression(int choice) {
	
		
		System.out.println(
				
				switch (choice) {
				case 1 -> 200;
				default -> 0;
				}
				);
	}
	
	public static void switchCaseWithYield(Status status) {
		
		String result = switch (status) {
		case PENDING: yield "will look into it";
		case FULLFILLED : yield "Happy Customer";
		default: 
		throw new IllegalArgumentException("Unexpected value: " + status);
		};
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
	
		Logger log = Logger.getAnonymousLogger();
		
		log.info("I am using Logger");
		
		CreditCard bobcard =
				new CreditCard(30303023, "Ramesh", 8949392);
		
		System.out.println(bobcard.cardHolderName() +","+bobcard.creditLimit());
		
		
		
		CreditCard sbicard =
				new CreditCard(30303023, "Ramesh", 8949392);
		
		
		
		System.out.println("Is Equal" + bobcard.equals(sbicard));
		
		
		System.out.println("Using To String"+ sbicard);
		
		
		//bobcard.creditLimit =494949;   not accessible
		
		// bobcard.setCreditLimit(3223230)  not possible since records are immutable
		
		Student yash1 = new Student(1020, "Yash");
		
		Student yash2 = new Student(1020, "Yash");
		
		System.out.println(yash1.compareTo(yash2));
		
		
		String student = """
				{
				   "id":101,
				   "firstName":"RAMESH"
				
				}
				
				""";
		
		
		System.out.println(student);
		
	}
}
