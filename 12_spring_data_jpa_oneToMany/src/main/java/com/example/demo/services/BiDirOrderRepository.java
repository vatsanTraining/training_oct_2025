package com.example.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.bidirection.OrderBook;
public interface BiDirOrderRepository extends JpaRepository<OrderBook, Integer> {

}
