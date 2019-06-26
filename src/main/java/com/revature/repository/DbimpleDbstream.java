package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.model.modelStream;

public class DbimpleDbstream implements DbStream{

	@Override
	public modelStream getmodelStream(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getmodelStream(String firstName, String password) {
		PreparedStatement statement = null;
		ResultSet resultSet =  null;
		modelStream mdStream = null;
		String valid = "YOU HAVE BEEN AUNTHENTICATED";
		System.out.println("\n");
		try(Connection conn = ConnectionsDB.getConnection()) {
			
			
			
			statement = conn.prepareStatement("SELECT * FROM customers WHERE firstName = ? AND password=?");
			statement.setString(1, firstName);
			statement.setString(2, password);
			statement.execute();
			resultSet = statement.getResultSet();
			resultSet.next(); // goes to the first result
			mdStream = new modelStream(resultSet);
			System.out.println("YOUR CURRENT BALANCE: "+ "$"+resultSet.getInt(9));
			
			
			
		} catch (SQLException e) {
//			e.printStackTrace();
			valid = "PLEASE TRY AGAIN";
		} finally {
			closeDb.close(statement);
			closeDb.close(resultSet);
		}
		return valid;
	}
	
	//@Override
	//public String updateBalance(String firstName, String password, int transaction) {
		
	//	int amount = 
	//	
		
		//return null;
		
	}
	
	


