package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@DiscriminatorValue(value = "MGR")
@Entity
public class Manager extends Employee {

	
	@Column(name = "location")
	private String location;
	
	@Column(name = "project")
	private String project;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Manager(int employeeId, String employeeName, String location, String project) {
		super(employeeId, employeeName);
		this.location = location;
		this.project = project;
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
	
	
}
