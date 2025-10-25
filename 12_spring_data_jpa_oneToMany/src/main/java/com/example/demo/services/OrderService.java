package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.MyOrder;
import com.example.demo.entity.OrderBook;

@Service
public class OrderService {

	
	
	private OrderRepository repo;

	
	
	public OrderService(OrderRepository repo) {
		super();
		this.repo = repo;
	}



	public boolean addTOrderBook() {
		
		
		List<MyOrder> orders = new ArrayList<>();
		
		 orders.add(new MyOrder("Zahir",5000));
		 
		 orders.add(new MyOrder("Yasim",7000));
		 
		 orders.add(new MyOrder("Xavier",9000));
	
		 OrderBook book =new OrderBook("oct-2025", orders);
		 
		 
		 this.repo.save(book);
		 
		 
		 
		 return true;
	}
	
	@Transactional(readOnly = true)
	public void print() {
		
		List<OrderBook> book =this.repo.findAll();
		
		System.out.println("Details of Order For Month of "+ book.get(0).getMonth());
		
		book.stream().map(e -> e.getOrders()).forEach(System.out::println);
		
//		for(MyOrder order: book.get(0).getOrders()) {
//			System.out.println("Order Id : "+ order.getOrderId() + " Customer Name : "+ order.getCustomerName() + " Order Value : "+ order.getOrderValue());
//		}
	}
	
	public void fetchOrderDetails(int id) {
		
		OrderBook book = this.repo.fetchOrder(id).get();
		
		System.out.println("Details of Order For Month of "+ book.getMonth());
		
		for(MyOrder order: book.getOrders()) {
			System.out.println("Order Id : "+ order.getOrderId() + " Customer Name : "+ order.getCustomerName() + " Order Value : "+ order.getOrderValue());
		}
	}
	}
