package com.example;

import com.example.demo.Student;
import com.example.demo.services.StudentService;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StudentService service =new StudentService();
		
		
		Student ram = new Student(100, "Ram", "Sharma", 90);
		
		// expected is grade should be null and the remaining  should be default values or assigned printed
		System.out.println("BEFORE METHOD CALL ===>"+ ram.toString() + ","+ram.hashCode());
		
		
		Student captured=service.assignGrade(ram);
		
		
		// expected grade to be populated and the remaining value should be printed
		System.out.println("AFTER METHOD CALL ***>"+ ram.toString() +","+ram.hashCode());
		System.out.println("AFTER METHOD CALL ***>"+ captured.toString() +","+ram.hashCode());
		
		
		// Using the Integer wrapper class and also auto boxing is done for the first argument
		
		Student shyam = new Student(Integer.valueOf(101), "Shyam", "Benegal", 28);
		
		System.out.println(service.assignGrade(shyam));

		
		
		
		Student vikas = new Student(Integer.parseInt(args[0]),args[1],args[2],Integer.parseInt(args[3]));
		
//		Integer abc = new Integer(30);
		
		
		System.out.println(service.assignGrade(vikas));
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		//TODO
		
		
		scanner.close();
		
		
		service.show();
		
		StudentService.showDetails();
		
		//Runnable task2 = new Runnable();
		
		// Annoymous InnerClass is created which implements Runnable  
		// className$number.class
		
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
	}

}
