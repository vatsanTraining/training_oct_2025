package com.example.demo.bidirection;

import java.util.ArrayList;
import java.util.List;

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


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity(name = "bi_orderbook")
@Table(name = "orderbook_bi_2026")

public class OrderBook {

	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="order_book_number")
	@Id
	private int orderId;
	
	@Column(name="month")
	private String month;

	
	@OneToMany(targetEntity = MyOrder.class, mappedBy = "book",
			cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<MyOrder> orders;


	
	public OrderBook() {
		super();
	}


	public OrderBook(String month, List<MyOrder> orders) {
		super();
		this.month = month;
		this.orders = orders;
	}


	public OrderBook(String month) {
		// TODO Auto-generated constructor stub
		
		this.month = month;
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
	
	public void addOrder(MyOrder order) {
	    if (this.orders == null) {
	        this.orders = new ArrayList<>();
	    }
	    this.orders.add(order);
	    order.setBook(this); 
	    	}
	
}
