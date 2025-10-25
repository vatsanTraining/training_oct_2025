package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.*;

@Entity
@Table(name = "professor_2026")
@PrimaryKeyJoinColumn(name="teacher_ref",referencedColumnName = "teacher_id")
public class Professor extends Teacher {

	@Column(name = "department")
	private String department;
	
	@Column(name = "salary")
	private double salary;
	
	//constructors setters and getters
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Professor(int teacherId, String name, String department, double salary) {
		super(teacherId, name);
		this.department = department;
		this.salary = salary;
	}
		
		public Professor( String name, String department, double salary) {
			super(name);
			this.department = department;
			this.salary = salary;
		}
		public String getDepartment() {
		return department;
	}
		public void setDepartment(String department) {
		this.department = department;
	}
		public double getSalary() {
		return salary;
	}
		public void setSalary(double salary) {
		this.salary = salary;
	}
		@Override
		public String toString() {
			return "Professor [department=" + department + ", salary=" + salary + "]";
		}
			
		
	
}


