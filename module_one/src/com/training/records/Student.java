package com.training.records;

public record Student(int rollNumber,String firstName)   implements Comparable<Student> {

	@Override
	public int compareTo(Student otherObj) {
		// TODO Auto-generated method stub
		return this.firstName.compareTo(otherObj.firstName);
	}

}
