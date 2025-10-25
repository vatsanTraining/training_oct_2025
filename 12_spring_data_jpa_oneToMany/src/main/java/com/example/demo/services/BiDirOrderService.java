package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bidirection.MyOrder;
import com.example.demo.bidirection.OrderBook;

@Service
public class BiDirOrderService {

	
private BiDirOrderRepository repo;

	
	
	 public BiDirOrderService(BiDirOrderRepository repo) {
		this.repo = repo;
	}
	
	public boolean addTOrderBook() {
		
		 OrderBook book =new OrderBook("Aug-2025");

		
		 book.addOrder(new MyOrder("BZahir",5000));
		 
		 book.addOrder(new MyOrder("BYasim",7000));
		 
		 book.addOrder(new MyOrder("BXavier",9000));
	
		 
		 
		 this.repo.save(book);
		 
		 
		 
		 return true;
	}

	
	@Transactional(readOnly = true)
	public void print() {
		
		List<OrderBook> books =this.repo.findAll();
		
		
		for( OrderBook order: books) {
			System.out.println("Order Id: Month "+ order.getOrderId()+order.getMonth());
			
			order.getOrders().stream().forEach(System.out::println);

		}
	
}
	
}
