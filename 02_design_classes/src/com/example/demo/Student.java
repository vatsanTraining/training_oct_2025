package com.example.demo;

public class Student {

	private int rollNumber;
	private String firstName;
	private String lastName;
	private int markScored;
	private String grade ="yet to assign";
	
	
	// constructor cannot be synchronized
	
//	public synchronized Student() {
//		super();
//	}

	// constructor have throws clause
//	public Student() throws RuntimeException {
//		super();
//	}
//	
	// constructor can any any modifier
	
//	protected Student() {
//		super();
//	}
	
	public Student() {
		super();
		
	}
	public Student(int rollNumber, String firstName, String lastName, int markScored) {
		super();
//		this();   either super() or this() never both
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.markScored = markScored;
		
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMarkScored() {
		return markScored;
	}

	public void setMarkScored(int markScored) {
		this.markScored = markScored;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String toString() {
		
		return this.firstName + this.markScored+this.grade;
	}
	
	// Named inner class , Inner class can have modifier like private and protected
	// they can also have static key word
	// className$innerClassName.class
	
	protected class SomeThing{
		
	}
}
