package com.example.demo.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
//@Table(name = "loan_auto")
//@Table(name = "loan_uuid")
@Table(name = "loan_UUID")
//@Table(name="loan_identity")

public class LoanApplication {

	
	@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	@SequenceGenerator(name = "myseq",initialValue = 100)
	
	
	@GeneratedValue(strategy = GenerationType.UUID)
	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private String applicationNumber;
	private String applicantName;
	public LoanApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public LoanApplication(String applicantName) {
		super();
		this.applicantName = applicantName;
	}


	public LoanApplication(String applicationNumber, String applicantName) {
		super();
		this.applicationNumber = applicationNumber;
		this.applicantName = applicantName;
	}
	public String getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	
	
	
}
