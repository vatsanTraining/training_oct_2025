package com.training;

public class Student {

	private String firstName;
	private String lastName;
	private double markScored;
	private Address address;
	
	
	
	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
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



	public double getMarkScored() {
		return markScored;
	}



	public void setMarkScored(double markScored) {
		
		if(markScored >100 || markScored <0) {
			System.out.println("Invalid Input Should be 0 -100");
		} else {
		this.markScored = markScored;
		}
	}



	public String toString() {
		
		return this.firstName+ this.lastName+this.markScored +this.address;
	}
}
