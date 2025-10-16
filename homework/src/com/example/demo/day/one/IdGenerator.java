package com.example.demo.day.one;

/**
 * My First Attempt to create a Simple Sigleton Pattern
 */
public class IdGenerator {

	
	private static IdGenerator obj;
	
	private IdGenerator() {
		
		
	}
	
	
	public static IdGenerator newInstance() {
		
		if(obj==null) {
			obj = new IdGenerator();
		}
		return obj;
	}
}
