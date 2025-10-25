package com.example.demo.services;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AddressDto;
import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;
import com.example.demo.ifaces.CustomerRepository;
import com.example.demo.model.Address;

@Service
public class CustomerService {


	Logger log = Logger.getLogger(CustomerService.class.toString());
	
	
//	@Autowired     // we will move to constructor injection , using just to revise field Injection
//	private Customer customer;
	
	private CustomerRepository repo;

	public CustomerService(CustomerRepository repo) {
		super();
		this.repo = repo;
		
		log.info("Repo Reference Name :===>" +repo.getClass().getName());
	}
	
	
	public List<CustomerDto> findAll(){
		
		return this.repo.findAll().stream().map(this::mapEntityToDto).collect(Collectors.toList());
	}
	
	public List<CustomerDto> findByName(String srch){
		
		return this.repo.findByCustomerName(srch).stream().map(this::mapEntityToDto).collect(Collectors.toList());

		
	}
	public CustomerDto save(CustomerDto dto) {
		
		  
		  Customer added = this.repo.save(mapDtoToEntity(dto));
		  
		  return mapEntityToDto(added);
		  
	}
	
	public CustomerDto mapEntityToDto(Customer entity) {
		
		return new CustomerDto(entity.getCustomerId(), entity.getCustomerName(), entity.getMobileNumber(),
				entity.getEmail(),entity.getCustomertype() ,mapAddToDto(entity.getBillingAddress()), 
				 mapAddToDto(entity.getShippingAddress()));
		
	}
	
	public Customer mapDtoToEntity(CustomerDto dto) {
		
		return new Customer(dto.customerId(), dto.customerName(), dto.mobileNumber(), dto.email(), dto.customertype(),
				dtoToAddress(dto.billingAddress()),dtoToAddress(dto.shippingAddress()));
	}
	
	private AddressDto mapAddToDto(Address address) {
		
		if(address ==null) {
			return new AddressDto("marble house","flower garden","green city",10120);
		} else {
		return new AddressDto(address.getLineOne(),address.getLineTwo(),address.getCity(),address.getPincode());
	}
	}
	
	private Address dtoToAddress(AddressDto dto) {
		
		if(dto ==null) {
			
			return new Address();

		} else {
		
		return new Address(dto.lineOne(), dto.lineTwo(), dto.city(), dto.pincode());
		
		}
	}
}
