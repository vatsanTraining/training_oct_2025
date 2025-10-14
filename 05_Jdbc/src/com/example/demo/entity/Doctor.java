package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Doctor {

	
	private int doctorId;
	private String doctorName;
	private String department;
	
	
	private List<Patient> patientList;
	
	
	public Doctor() {
		super();
		this.patientList = new ArrayList<>();

	}
	public Doctor(int doctorId, String doctorName, String department) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.department = department;
		this.patientList = new ArrayList<>();
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<Patient> getPatientList() {
		return patientList;
	}
	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", department=" + department
				+ ", patientList=" + patientList + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(department, doctorId, doctorName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		return Objects.equals(department, other.department) && doctorId == other.doctorId
				&& Objects.equals(doctorName, other.doctorName);
	}
	
	
	
}
