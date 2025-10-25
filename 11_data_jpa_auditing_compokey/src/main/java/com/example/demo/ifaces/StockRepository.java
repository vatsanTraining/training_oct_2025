package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.demo.entity.Stock;


public interface StockRepository<T,I> extends JpaRepository<Stock, Integer> {

	
}
