package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "myorder_2025")
public class MyOrder {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="order_id")
	private int orderId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="order_value")
	private double orderValue;

	public MyOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyOrder(int orderId, String customerName, double orderValue) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderValue = orderValue;
	}

	
	public MyOrder(String customerName, double orderValue) {
		super();
		this.customerName = customerName;
		this.orderValue = orderValue;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}

	@Override
	public String toString() {
		return "MyOrder [orderId=" + orderId + ", customerName=" + customerName + ", orderValue=" + orderValue + "]";
	}
	
	
	
}
