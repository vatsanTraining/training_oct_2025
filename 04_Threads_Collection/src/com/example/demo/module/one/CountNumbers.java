package com.example.demo.module.one;


public class CountNumbers {

	
	private int count ;
	
	public CountNumbers(int count) {
		
		this.count =count;
		
	}
	
	
	public void sumNumbers() {
		
		int total =0;
		
		for(int i=0;i<=count;i++) {
			total+=i;
		}
		
		System.out.println(Thread.currentThread().getName()+" Total =>"+total);
	}
	
}
