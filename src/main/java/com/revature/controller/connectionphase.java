package com.revature.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connectionphase {

	public static void getaccount(ResultSet resultSet) throws SQLException {
		while(resultSet.next()) {
			StringBuffer buffer = new StringBuffer();
			
			buffer.append("customerId" + resultSet.getInt("CustomerId")+ " ");
			buffer.append(resultSet.getString("firstname") + " ");
			buffer.append("Balance " +"$" + resultSet.getInt("Balance"));
			
			
			
			
			System.out.println(buffer.toString());
			
		}
	}
	
	
		
	}

