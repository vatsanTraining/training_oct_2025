
package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Doctor;
import com.example.demo.ifaces.MyDao;

@Service
public class DoctorService {

	
	private MyDao<Doctor> dao;
	
	
	// Constructor DI will happen here
	
	public DoctorService(MyDao<Doctor> dao) {
		super();
		this.dao = dao;
	}



	public List<Doctor> findAll(){
		
		return this.dao.findAll();
	}
	
	public boolean save(Doctor obj) {
		
		return this.dao.save(obj);
	}



	public Doctor findById(int id) {
		// TODO Auto-generated method stub
		return this.dao.findById(id);
	}
}
