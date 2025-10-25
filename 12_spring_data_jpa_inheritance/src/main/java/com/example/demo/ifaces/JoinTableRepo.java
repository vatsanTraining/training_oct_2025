package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Teacher;

public interface JoinTableRepo<T extends Teacher> extends JpaRepository<T, Integer> {

	
	
}
