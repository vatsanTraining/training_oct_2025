package com.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.demo.utils.ConnectionUtils;

public class TxnDemo {

	public static void main(String[] args) throws SQLException {

		
		
		try(Connection con = ConnectionUtils.getMySqlConnection()) {

			
			con.setAutoCommit(false);
			
			
			String insertSql = "insert into doctor_2025 values(?,?,?)";
			

			String updateSql = "update patient_2025 set doctor_ref =598 where patient_id=7278";
			
			
			PreparedStatement inrtStmt = con.prepareStatement(insertSql);
			
			inrtStmt.setInt(1, 598);
			inrtStmt.setString(2,"Admin");
			inrtStmt.setString(3,"SKIN");
			
			
               int rowAdded =inrtStmt.executeUpdate();
			
			PreparedStatement upStmt = con.prepareStatement(updateSql);
			

			int rowUpdated =upStmt.executeUpdate();
			
			
			if(rowAdded==1 && rowUpdated==1) {
				System.out.println("Txn successful");
				con.commit();
			}
			else {
				con.rollback();
				throw new SQLException("Txn  failed");
			}
			
			
			con.setAutoCommit(true);
		} catch (SQLException  e) {
			
			e.printStackTrace();
		}
		
		
	}

}
