package com.example.demo.services;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.OrderBook;

public interface OrderRepository extends JpaRepository<OrderBook, Integer> {

	
    @Query("SELECT ob FROM OrderBook ob JOIN FETCH ob.orders WHERE ob.orderId = :id")
	Optional<OrderBook> fetchOrder(int id);

}
