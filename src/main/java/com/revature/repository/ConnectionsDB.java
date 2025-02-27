package com.revature.repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionsDB {
	
private static Connection conn = null;
	
	static {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	      	public static Connection getConnection() {
	      		
	      try {
			Properties properties = new Properties();
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			properties.load(loader.getResourceAsStream("ConnectionsDB1.properties"));
			
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			
			conn = DriverManager.getConnection(url, username, password);
			
			
			
			
			System.out.println("=====================================");
			
	      } catch (IOException | SQLException e) {
	    	  e.printStackTrace();
	      }
			return conn;
		}
}
