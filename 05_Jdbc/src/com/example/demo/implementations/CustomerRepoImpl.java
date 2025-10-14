package com.example.demo.implementations;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Table;
import com.example.demo.ifaces.CrudReposiotry;
import com.example.demo.utils.Status;

public class CustomerRepoImpl implements CrudReposiotry<Customer> {
	
	
	private Connection con;

	
	private String insertSql = "insert into customer_2025 values(?,?,?,?,?)";
	private String selectSql = process();
	private String findByIdSql = "select * from customer_2025 where customer_id =?";
	private String removeSql = "delete from customer_2025 where customer_id =?";
	
	
	public CustomerRepoImpl(Connection con) {
		
	
		this.con = con;
	}

	@Override
	public boolean add(Customer t) {

		int rowAdded =0;
		
		try(PreparedStatement pstmt = con.prepareStatement(insertSql)) {
			
			pstmt.setInt(1, t.getCustomerId());
           
			pstmt.setString(2,t.getCustomerName());
           
            pstmt.setDate(3,Date.valueOf(t.getBillDate()));
            
            pstmt.setDouble(4, t.getAmountDue());

            pstmt.setString(5,t.getPaymentStatus().toString());

 
            rowAdded = pstmt.executeUpdate();
			
		} catch (Exception e) {
              e.printStackTrace();
		}
		
		return rowAdded==1?true:false;
	}

	@Override
	public Customer findById(int id) {

		Customer foundCustomer = null;

		try (PreparedStatement pstmt = con.prepareStatement(findByIdSql);

		) {

			pstmt.setInt(1, id);

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {

					foundCustomer = rowMapper(rs);

				}
			}

		} catch (SQLException ex) {

			throw new RuntimeException(ex.getMessage());
		}

		return foundCustomer;
		}

	@Override
	public boolean remove(int id) {

		int rowDeleted = 0;

		try (PreparedStatement pstmt = con.prepareStatement(removeSql);

		) {

			pstmt.setInt(1, id);

			 rowDeleted = pstmt.executeUpdate();
					 
		} catch (SQLException ex) {

			throw new RuntimeException(ex.getMessage());
		}
		
		return rowDeleted==1?true:false;
	}

	@Override
	public Collection<Customer> findAll() throws RuntimeException {

		List<Customer> custList = new ArrayList<>();
		
		try(
				 PreparedStatement pstmt = con.prepareStatement(selectSql);
				 ResultSet rs = pstmt.executeQuery()){
			
			
		while(rs.next()) {
			
			Customer obj = rowMapper(rs);
			
			custList.add(obj);
		}
		}catch(SQLException ex) {
			
			throw new RuntimeException(ex.getMessage());
		}
		
		
		
		return custList;
	}
	
	
	public boolean addAll(Customer ...customers)  {
		
		
		 String removeSql2 = "delete from customer_2025 where customer_id >600";

		try(PreparedStatement pstmt = con.prepareStatement(insertSql)) {
			con.setAutoCommit(false);
			
			
			
			for(Customer eachCustomer: customers) {
				
				pstmt.setInt(1, eachCustomer.getCustomerId());
		           
				pstmt.setString(2,eachCustomer.getCustomerName());
	           
	            pstmt.setDate(3,Date.valueOf(eachCustomer.getBillDate()));
	            
	            pstmt.setDouble(4, eachCustomer.getAmountDue());

	            pstmt.setString(5,eachCustomer.getPaymentStatus().toString());
				
	            
	            pstmt.addBatch();
	            
	            
	            
			}
		  	
			pstmt.addBatch(removeSql2);
			
			  int[] choices = pstmt.executeBatch();
			
			  for(int j : choices) {
				  
				  System.out.println("row Count  :=>"+j);
			  }
			  
			  con.commit();	  
			  
			  
			con.setAutoCommit(true);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return true;
	}

	private Customer rowMapper(ResultSet rs) throws SQLException {
		
		
				int customerId =rs.getInt("customer_id");
				String customerName=rs.getString("customer_name");
				String status=rs.getString("payment_staus");
				LocalDate billDate=rs.getDate("bill_date").toLocalDate();
				double amountDue= rs.getDouble("amount_due");
		
		return new Customer(customerId, customerName, billDate, amountDue, Status.valueOf(status));
		
		
		
	}
	
	private String process() {
		
		Class<?> cls = new Customer().getClass();
		
		String sql ="select * from ";
		

		           Table table = cls.getAnnotation(Table.class);
		           
		     
		           String tableName = table.name();
		           
		           
		
		return sql+tableName;
	}
}


