package com.example.demo.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.NameRepository;

@Service
public class SecondService {

	
	Logger log = Logger.getAnonymousLogger();
	
	// Field Injection
	@Autowired
	private NameRepository repo;

	private Student student;
	
	
	public SecondService(Student stud) {
		this.student =stud;
	}
	
	
	public List<String> getNames(){
		
		log.info(repo.getClass().getName());
		
		return repo.getNames();
	}
	
	
	public String getBestStudent() {
	
		return this.repo.getBestName();
	}
	
	public String getNextBestStudent() {
		
		return this.student.toString();
	}
	
}
