package com.example.demo;

import com.example.demo.utils.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class ConfigResultSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Connection con =null;
		 try {
			con = ConnectionUtils.getMySqlConnection();
			
			
			String sql ="Select * from customer_2025";
			
			
			PreparedStatement pstmt  =con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE , ResultSet.CONCUR_UPDATABLE);
			
			
			ResultSet rs = pstmt.executeQuery();
			
			
			   System.out.println("Is cursor before first:=>"+  rs.isBeforeFirst());
			   
			   
			   rs.absolute(2);

			   	System.out.println(rs.getInt(1) + rs.getString(2));

				   rs.relative(1);

				   	System.out.println(rs.getInt(1) + rs.getString(2));


				   	rs.relative(-2);

				   	System.out.println(rs.getInt(1) + rs.getString(2));

				   	
				   rs.first();
				   

				   	System.out.println(rs.getInt(1) + rs.getString(2));

				   	rs.last();
				   	
				   
				   	System.out.println( "last Row"+rs.getInt(1) + rs.getString(2));

				   	rs.last();
				   	rs.updateString(2,"Added Shurbi");
				   	rs.updateRow();
				   	 
			   System.out.println("Is cursor before Last:=>"+  rs.isAfterLast());

			   
			
			
		 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
			
		
	}

}
