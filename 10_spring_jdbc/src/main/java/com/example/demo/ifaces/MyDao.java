package com.example.demo.ifaces;

import java.util.List;

import com.example.demo.Doctor;


public interface MyDao<T> {

	List<T> findAll();

	boolean save(Doctor doctor);

	Doctor findById(int id);

}
