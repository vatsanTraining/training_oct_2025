package com.example.demo.services;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CustomerDto;
import com.example.demo.dto.ICustomer;
import com.example.demo.entity.Customer;
import com.example.demo.ifaces.CustomerRepository;
import com.example.demo.ifaces.CustomerWithSpecification;
import com.example.demo.utils.CustomSpecs;

import jakarta.transaction.Transactional;

@Service
public class CustomerService {

	
	CustomerRepository repo ;
	
	CustomerWithSpecification custSpecRepo;
	
	public CustomerService(CustomerRepository repo,CustomerWithSpecification custSpecRepo) {
		
		this.repo = repo;
		
		this.custSpecRepo = custSpecRepo;
	}
	
	public List<Customer> findByCustomerName(String srchString){
		
		return this.repo.findByCustomerName(srchString);
		
		
	}
	
	public Customer findByEmail(String srchString){
		
		return this.repo.queryByEmail(srchString);
	}
	
	
   public List<CustomerDto> findByCustomerNameWithProjection(String srchString){
		
		return this.repo.readByCustomerName(srchString);
		
		
	}
	
	public ICustomer findByEmailWithProjection(String srchString){
		
		return this.repo.findByEmail(srchString);
	}
	
	public int updateMobile(long oldNumber,long latestNumber) {
		
		return this.repo.updateMobileNumber(oldNumber, latestNumber);
	}
	
	@Transactional
	public Map<String,Long> useStream(int id){
		
		
		return this.repo.findByCustomerIdGreaterThan(id)
				 .collect(Collectors.toMap(Customer::getCustomerName, Customer::getMobileNumber));
	}
	
	public List<Customer> findCustomerUsingSpec(String name){
		
		return this.custSpecRepo.findAll(CustomSpecs.findByCustomerName(name));
	}
	
	public List<Customer> getCustomerSortedByProp(String propName){
		
		return this.repo.findAll(Sort.by(propName).descending());
	}
	
	public Page<Customer> usePagination(int pageNo,int size) {
		
		Pageable page =PageRequest.of(pageNo, size);
		
		
		return this.repo.findAll(page);
		
	}
}
