package com.example.demo;

import java.time.LocalDate;
import java.util.List;

public class OrderBook {

	
	private int id;
	private  LocalDate date;
	private  List<Order> orderList;
	public OrderBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderBook(int id, LocalDate date, List<Order> orderList) {
		super();
		this.id = id;
		this.date = date;
		this.orderList = orderList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	
	
	
}
