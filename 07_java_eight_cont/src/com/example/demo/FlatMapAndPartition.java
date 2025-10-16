package com.example.demo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;






public class FlatMapAndPartition {

	
	
	
	public static void main(String[] args) {
		
		
		List<Integer> marks1 = Arrays.asList(90,80,70,60);

		List<Integer> marks2 = Arrays.asList(50,40,30,20);

		
		List<List<Integer>> combinedList =List.of(marks1,marks2);
		
		
		
	List<Integer> mappedList =	combinedList.stream()
			                          .flatMap(e -> e.stream()).collect(Collectors.toList());
		
	
	 mappedList.forEach(System.out::println);
	 
	
	
	 Order ramOrderOne = new Order(1010, 8000, "Ram");
	 
	 Order shyamOrderOne = new Order(2010, 9000, "shyam");

	 Order ramOrderTwo = new Order(3010, 7000, "Ram");

	 Order shyamOrderTwo = new Order(4010, 5000, "Shyam");

		
		List<Order> firstOrder = Arrays.asList(ramOrderOne,ramOrderTwo);
		
		List<Order> secondOrders = Arrays.asList(shyamOrderOne,shyamOrderTwo);
				
				
	     OrderBook book1 = new OrderBook(1, LocalDate.of(2024, 4, 4), secondOrders)	;	
	     
	     OrderBook book2 = new OrderBook(2, LocalDate.of(2024, 4, 4), firstOrder)	;	
	     
	     
	     List<OrderBook> orderBookList = Arrays.asList(book1,book2);
	     
	     
	     
	    List<Order> allorders = orderBookList.stream().flatMap(e -> e.getOrderList().stream()).collect(Collectors.toList());
	    
	    
	    allorders.forEach(System.out::println);
	    
	    
	    // partition by customerName 
	    
	    
	   Map<Boolean,List<Order>>  partList=orderBookList.stream().
	             flatMap(e -> e.getOrderList().stream()).
	             collect(Collectors.partitioningBy(e ->e.getCustomerName().equals("Ram")));
	    
	   
	   System.out.println("Rams Order ========");
	   
	   partList.get(true).forEach(System.out::println);
	   

	   System.out.println("Shyams Order ========");

	    
	   partList.get(false).forEach(System.out::println);

	}
}
