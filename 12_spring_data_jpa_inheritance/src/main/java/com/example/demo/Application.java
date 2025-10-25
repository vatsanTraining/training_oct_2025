package com.example.demo;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Manager;
import com.example.demo.entity.Professor;
import com.example.demo.entity.Teacher;
import com.example.demo.ifaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.ManagedArray;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
	
	@Bean
	CommandLineRunner joinRunner() {
		
		
		return new CommandLineRunner() {
			
			@Autowired
			JoinTableRepo<Teacher> repo;
			@Override
			public void run(String... args) throws Exception {
				
//				repo.save(new Manager(10102, "Gauri", "PNQ", "amex"));
//				
//				repo.save(new Manager(20102, "meena", "GUR", "dbs"));
//				
//				
				repo.save(new Professor("Prof Priya", "biology", 35000));
//				
				
				System.out.println(repo.findById(2));
				
				//System.out.println(repo.findById(10102));
				
				
				
				
			}
		};
	}
	
	
	@Bean
	CommandLineRunner runner() {
		
		
		return new CommandLineRunner() {
			
			@Autowired
			SingeTableRepo<Employee> repo;
			@Override
			public void run(String... args) throws Exception {
				
//				repo.save(new Manager(10102, "Gauri", "PNQ", "amex"));
//				
//				repo.save(new Manager(20102, "meena", "GUR", "dbs"));
//				
//				
				//repo.save(new Employee(300, "sishya"));
//				
				
				System.out.println(repo.findById(200));
				
				System.out.println(repo.findById(10102));
				
				
				
				
			}
		};
	}
}
