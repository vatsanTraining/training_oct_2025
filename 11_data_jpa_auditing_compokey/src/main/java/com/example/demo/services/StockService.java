package com.example.demo.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Stock;

@Service
public class StockService {

	
	
	private JpaRepository<Stock, Integer> repo;

	public StockService(JpaRepository<Stock, Integer> repo) {
		super();
		this.repo = repo;
	}
	
	
	public Stock save(Stock entity) {
		
		return this.repo.save(entity);
	}
	
	public List<Stock> findAll(){
		
		return this.repo.findAll();
	}
}
