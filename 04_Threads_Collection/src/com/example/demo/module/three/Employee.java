package com.example.demo.module.three;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

	private int employeeId;
	private String employeeName;
	private String location;
	private double salary;
	
	
	public Employee() {
		super();
	}
	public Employee(int employeeId, String employeeName, String location, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.location = location;
		this.salary = salary;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName, location, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
				&& Objects.equals(location, other.location)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", location=" + location
				+ ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee otherObj) {
		
		if( this.employeeId <otherObj.employeeId) return -1;
		if(this.employeeId>otherObj.employeeId) return 1;
		return 0;
	}
	
	
	
	
}
