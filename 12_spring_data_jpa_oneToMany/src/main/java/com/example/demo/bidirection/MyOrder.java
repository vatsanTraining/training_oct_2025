package com.example.demo.bidirection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "bi_myorder")
@Table(name = "myorder_bi_2026")
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
	
	@ManyToOne(fetch = FetchType.LAZY) 
	 @JoinColumn(name = "book_id", 
	 referencedColumnName = "order_book_number")
	  private OrderBook book;
	

	public OrderBook getBook() {
		return book;
	}
	public void setBook(OrderBook book) {
		this.book = book;
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
