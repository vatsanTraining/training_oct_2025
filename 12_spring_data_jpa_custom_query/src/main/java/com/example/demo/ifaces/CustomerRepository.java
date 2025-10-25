package com.example.demo.ifaces;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.dto.CustomerDto;
import com.example.demo.dto.ICustomer;
import com.example.demo.entity.Customer;

import jakarta.transaction.Transactional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	
	List<Customer> findByCustomerName(String srchString);
	
	Customer queryByEmail(String srchString);
	
	// Its not a DSL(Domain Specific Language Query) meaning naming convention not followed
	
	//JPQL
	@Query(value = "from Customer where customerName=:srch",nativeQuery = false)
	List<Customer> fetchCustomerNames(@Param("srch") String queryString);
	

	//SQL
	@Query(value = "select * from customer_2027 where customerId=:id",nativeQuery = true)
	List<Customer> fetchCustomerByPrimKey(@Param("id") int id);

	// Using Projections
	
	List<CustomerDto> readByCustomerName(String srchString);
	
	ICustomer findByEmail(String srchString);
	
	
	// just to understand adding method with wrong syntax
	
	//List<Customer> findByCustomerIde(int srch);
	
	
	@Query(value = "update Customer set mobileNumber=:latestNumber where mobileNumber=:oldNumber")
	@Modifying
	@Transactional
	int updateMobileNumber(@Param("oldNumber") long oldNumber, @Param("latestNumber") long latestNumber);
	
	
	Stream<Customer> findByCustomerIdGreaterThan(int id);
	
	
}
