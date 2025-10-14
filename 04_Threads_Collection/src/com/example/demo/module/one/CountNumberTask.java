package com.example.demo.module.one;

public class CountNumberTask implements Runnable {

	private CountNumbers service;
	private int countUpTo;
	private String name;
	
	
	
	
	public CountNumberTask(int countUpTo, String name) {
		
		super();
		
		
		this.countUpTo = countUpTo;
		this.name = name;
		
		this.service= new CountNumbers(countUpTo);
		
		Thread thread = new Thread(this,name);
		thread.start();
	}




	@Override
	public void run() {
		

	this.service.sumNumbers();
		
	}

}
