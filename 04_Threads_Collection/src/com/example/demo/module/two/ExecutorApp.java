package com.example.demo.module.two;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorApp {

	
	public static void singleThread(PrintStringTask[] tasks) {
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		
		for(PrintStringTask eachTask: tasks) {
			
			executor.submit(eachTask);
		}
		
		executor.shutdown();
	}
	
	public static void fixedThread(PrintStringTask[] tasks) {
		
		ExecutorService executor = Executors.newFixedThreadPool(6);
		
		
		for(PrintStringTask eachTask: tasks) {
			
			executor.submit(eachTask);
		}
		
		executor.shutdown();
	}
	
	public static PrintStringTask[] init() {
		
		PrintStringTask[] tasks =new PrintStringTask[]
				{
				 new PrintStringTask("Idly","Sambhar"),
				 new PrintStringTask("Pizza","Coke"),
				 new PrintStringTask("Pav","Misal"),
				 new PrintStringTask("Tea","Biscuit")
			 };

		return tasks;
	}
	public static void main(String[] args) {

		
		
//		System.out.println("Single Thread");
//		
//		singleThread(init());

		
		System.out.println("Fixed Thread");
		
		
		fixedThread(init());

		
		
	}

}
