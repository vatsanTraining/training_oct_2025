package com.example.demo;

public class Order {

	 private int orderId;
	 private double orderValue;
	 private String customerName;
	 
	 
	 public Order() {
		super();
	 }
	 public Order(int orderId, double orderValue, String customerName) {
		super();
		this.orderId = orderId;
		this.orderValue = orderValue;
		this.customerName = customerName;
	 }
	 public int getOrderId() {
		 return orderId;
	 }
	 public void setOrderId(int orderId) {
		 this.orderId = orderId;
	 }
	 public double getOrderValue() {
		 return orderValue;
	 }
	 public void setOrderValue(double orderValue) {
		 this.orderValue = orderValue;
	 }
	 public String getCustomerName() {
		 return customerName;
	 }
	 public void setCustomerName(String customerName) {
		 this.customerName = customerName;
	 }
	 @Override
	 public String toString() {
		return "Order [orderId=" + orderId + ", orderValue=" + orderValue + ", customerName=" + customerName + "]";
	 }
	 
	 
	 

}
