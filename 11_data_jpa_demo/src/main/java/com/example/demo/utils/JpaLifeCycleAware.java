package com.example.demo.utils;

import java.util.logging.Logger;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Customer;

import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostRemove;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreRemove;
import jakarta.persistence.PreUpdate;

@Component
public class JpaLifeCycleAware {

	Logger log = Logger.getAnonymousLogger();
	@PrePersist
	@PreUpdate
	@PreRemove
	public void persist(Customer cust) {
		
		if(cust.getCustomerId() ==0) {
			
			log.info("=========> One customer About to Add");
		} else {
			
			log.info("******* One Customer Removed/updated ");
		}
		
	}
	
	@PostPersist
	@PostUpdate
	@PostRemove
	public void afterUpdate(Customer cust) {
		
		if(cust.getCustomerId()!=0) {
			log.info("$$$$$$$> One Customer Added");
		} else {
			
			log.info("@@@@@ one Customer updated/removed");
		}
		
	}
	
	@PostLoad
	public void afterLoad(Customer cust) {
		
		
		cust.setCustomerName(  "Er.".concat(cust.getCustomerName()));
	}
	
}
