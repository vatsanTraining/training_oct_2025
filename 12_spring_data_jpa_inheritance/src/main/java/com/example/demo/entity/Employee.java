package com.example.demo.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_one_hierarchy")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "empType")
@DiscriminatorValue(value = "EMP")
public class Employee {

	
	@Id
	@Column(name = "employee_id")
	private int employeeId;
	
	@Column(name = "employee_name")
	private String employeeName;
	
		public Employee() {
		super();
		
	}
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;			
	}
		public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
			public String getEmployeeName() {
		return employeeName;
	}
				public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
					
				//toString method
				@Override
					public String toString() {
					return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
				}
				

}
