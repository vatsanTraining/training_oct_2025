package com.example.demo.utils;

import java.sql.*;
import java.util.ResourceBundle;
public class ConnectionUtils {

	
	public static Connection getMySqlConnection() {
		
		
		Connection con = null;
		
		try {
			
			ResourceBundle bundle = ResourceBundle.getBundle("application");
			
			
			String url = bundle.getString("datasource.url");
			String username = bundle.getString("datasource.username");
			String password = bundle.getString("datasource.password");
			
			
			con = DriverManager.getConnection(url,username,password);
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static Connection getPostgressConnection() {
		
		return null;
	}
	
	
}
