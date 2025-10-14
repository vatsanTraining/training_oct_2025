package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Objects;

import com.example.demo.utils.Status;

@Table(name="customer_2025")
public class Customer {

	
	private int customerId;
	private String customerName;
	private LocalDate billDate;
	private double amountDue;
	private Status paymentStatus;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, LocalDate billDate, double amountDue, Status paymentStatus) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.billDate = billDate;
		this.amountDue = amountDue;
		this.paymentStatus = paymentStatus;
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
	public LocalDate getBillDate() {
		return billDate;
	}
	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}
	public double getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
	public Status getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(Status paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	@Override
	public int hashCode() {
		return Objects.hash(amountDue, billDate, customerId, customerName, paymentStatus);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Double.doubleToLongBits(amountDue) == Double.doubleToLongBits(other.amountDue)
				&& Objects.equals(billDate, other.billDate) && customerId == other.customerId
				&& Objects.equals(customerName, other.customerName) && paymentStatus == other.paymentStatus;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", billDate=" + billDate
				+ ", amountDue=" + amountDue + ", paymentStatus=" + paymentStatus + "]";
	}
	
	
	
}



