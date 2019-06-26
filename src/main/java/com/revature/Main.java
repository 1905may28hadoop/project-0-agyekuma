package com.revature;




import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


import com.revature.controller.Controller;
import com.revature.controller.connectionphase;
import com.revature.model.modelStream;


import com.revature.repository.ConnectionsDB;

import com.revature.repository.DbStream;
import com.revature.repository.DbimpleDbstream;

/** 
 * Create an instance of your controller and launch your application.
 * 
 * Try not to have any logic at all on this class.
 */
public class Main {

	public static void main(String[] args) throws Exception{
	
		
		
				
		
	
DbStream StreamDao = new DbimpleDbstream();
		
Scanner input = new Scanner(System.in);

		System.out.println("Please Enter your name:");
		String Username = input.nextLine();
		System.out.println("Please Enter your Password:");
		String Password = input.nextLine();
		
//		String Username = "Jon";
//		String Password = "pass2";

	
		
		
		
		//System.out.println(StreamDao.getmodelStream(Username, Password));
		
		

			Controller.showMenu();
			 
		
		
		input.close();
		
		
//Connection conn = ConnectionsDB.getConnection();
//Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");
//connectionphase.getaccount(resultSet);
//		resultSet.last();
//	System.out.println(resultSet.getString("Balance"));
		
	
		
		
		ConnectionsDB.getConnection();
		//Controller.Menu();
		//modelStream.toString();
		
	}

}