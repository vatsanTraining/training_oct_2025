package com.example.demo.exceptions;

import java.io.Serializable;

/**
 * Custom Exception Designed to Handle Range of Values
 * @author srivatsan
 * Custom Exception Class
 * @since version 1.0
 */
public class RangeCheckException extends Exception implements Serializable {

	
	
	private static final long serialVersionUID = 120L;
	
	
	/**
	 * instance variable to take error message
	 */
	private String message;

	/**
	 * Constructor to handle error message
	 * @param message error message with error code
	 */
	public RangeCheckException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return  this.message.toUpperCase();
		
				
	}
	
	
	

}
