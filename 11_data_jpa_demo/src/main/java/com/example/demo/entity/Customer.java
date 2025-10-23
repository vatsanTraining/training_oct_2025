package com.example.demo.entity;

import com.example.demo.model.Address;
import com.example.demo.utils.JpaLifeCycleAware;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "customer_2026", schema = "test",
                uniqueConstraints = @UniqueConstraint(columnNames = {"mobileNumber","email"}))
@EntityListeners(JpaLifeCycleAware.class)
public class Customer {


	@Id
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "customer_name",length = 30)
	private String customerName;
	
	@Column(name="mobile_number")
	private long mobileNumber;
	
	@Column(name ="email",length = 50)
	private String email;
	
	@Column(name="customer_type",length = 20)
	@Enumerated(EnumType.STRING)
	private CustomerType customertype;

	
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(column = @Column(name="bill_line_one"),name = "lineOne"),
		@AttributeOverride(column = @Column(name="bill_line_two"),name = "lineTwo"),
		@AttributeOverride(column = @Column(name="bill_city"),name = "city"),
		@AttributeOverride(column = @Column(name="bill_pincode"),name = "pincode"),
			
	})
	private Address billingAddress;
	

	@Embedded
	@AttributeOverrides({
		@AttributeOverride(column = @Column(name="ship_line_one"),name = "lineOne"),
		@AttributeOverride(column = @Column(name="ship_line_two"),name = "lineTwo"),
		@AttributeOverride(column = @Column(name="ship_city"),name = "city"),
		@AttributeOverride(column = @Column(name="ship_pincode"),name = "pincode"),
			
	})

	private Address shippingAddress;
	
	
	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, long mobileNumber, String email, CustomerType customertype) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.customertype = customertype;
	}
	
	

	public Customer(int customerId, String customerName, long mobileNumber, String email, CustomerType customertype,
			Address billingAddress, Address shippingAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.customertype = customertype;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CustomerType getCustomertype() {
		return customertype;
	}

	public void setCustomertype(CustomerType customertype) {
		this.customertype = customertype;
	}
	
	

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobileNumber="
				+ mobileNumber + ", email=" + email + ", customertype=" + customertype + "]";
	}
	
	
	
}
