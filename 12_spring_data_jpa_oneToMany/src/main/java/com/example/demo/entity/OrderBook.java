package com.example.demo.entity;

import java.util.List;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "orderbook_2025")

public class OrderBook {

	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="order_book_number")
	@Id
	private int orderId;
	
	@Column(name="month")
	private String month;

	
	@OneToMany(targetEntity = MyOrder.class ,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "order_ref" ,referencedColumnName = "order_book_number")
	private List<MyOrder> orders;


	public OrderBook() {
		super();
	}


	public OrderBook(String month, List<MyOrder> orders) {
		super();
		this.month = month;
		this.orders = orders;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public List<MyOrder> getOrders() {
		return orders;
	}


	public void setOrders(List<MyOrder> orders) {
		this.orders = orders;
	}
	
	
}
