package com.example.demo.model;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Stock;

@Component
public class SpecWrapper {

	
	public static Specification<Stock> getSpecByWarehouseLocation(String location) {
		return (root, query, criteriaBuilder) -> {
			criteriaBuilder.greaterThan(root.get("location"), location);
			return criteriaBuilder.equal(root.get("warehouseLocation"), location);
		};
	}
}


