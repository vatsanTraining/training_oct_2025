package com.training;

public class StudentService {

	/*
	 * Take the Student as argument 
	 * if the markScore greater than 80 assign A else B
	 */
	public String assignGrade(Student student) {
		
		String grade ="B";
		
		if(student.getMarkScored()>80) {
			grade ="A";
		}
		return grade;
	}
}
