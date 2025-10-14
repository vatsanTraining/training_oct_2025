package com.example.demo.module.one;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Current Thread:=>"+ Thread.currentThread().getName());
		
		
		
		
		try {
			
			// requesting main thread to sleep for 50 milli seconds
			Thread.sleep(50);
			
			
			// Multiple threads
			new CountNumberTask(10, "Ten Counter");
			
			new CountNumberTask(100, "Hundred Counter");
			
			new CountNumberTask(1000, "Thousand Counter");
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		
	}

}
