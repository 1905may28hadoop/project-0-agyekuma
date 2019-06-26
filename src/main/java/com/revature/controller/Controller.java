package com.revature.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.revature.model.modelStream;
import com.revature.repository.ConnectionsDB;
import com.revature.repository.DbimpleDbstream;


public class Controller extends modelStream  {
	
	
	
	 public Controller(int customerId, String firstName, String lastName, String address, String state, String country,
			String phone, String email, int balance, int accountId, String password) {
		super(customerId, firstName, lastName, address, state, country, phone, email, balance, accountId, password);
		// TODO Auto-generated constructor stub
	}


	static int balance= 0;
	int previousTransaction;
	
	
	
	
		






		public static void showMenu() {
		char choice ='\n';
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome");
		
		
		do 
		{
		
			System.out.println("/////////////////////////////////////");
			System.out.println("PLEASE MAKE A CHOICE");
			System.out.println("/////////////////////////////////////");
			System.out.println("\n");
			System.out.println("1. CHECK YOUR BALANCE");
			System.out.println("2. WITHDRAW MONEY");
			System.out.println("3. DEPOSITE MONEY");
			System.out.println("4. PREVIOUS TRANSACTION");
			System.out.println("5. EXIT");
			choice = input.next().charAt(0);
			System.out.println("\n");
		switch (choice) {
		case '1':
			System.out.println("/////////////////////////////////////");
			System.out.println("BALANCE "+ "$"+ balance); 
			System.out.println("/////////////////////////////////////");
			System.out.println("\n");
			break;
			
			
		case '2':
			System.out.println("/////////////////////////////////////");
			System.out.println("ENTER AMOUNT TO WITHDRAW");
			System.out.println("/////////////////////////////////////");
			int amount1 = input.nextInt();
			System.out.println("\n");			
			break;
			
			
		case '3':
			System.out.println("/////////////////////////////////////");
			System.out.println("ENTER AMOUNT TO DEPOSITE");
			System.out.println("/////////////////////////////////////");
			int amount = input.nextInt();
			System.out.println("\n");			
			break;
				
			
			
		case '4':
			System.out.println("/////////////////////////////////////");
			//getpreviousTransaction();
			System.out.println("/////////////////////////////////////");
			System.out.println("\n");					
			break;
			
		case '5':
			System.out.println("/////////////////////////////////////");
			break;
							
		default:
		System.out.println("TRY AGAIN, INVALID INPUT");
		break;
		}
		
		}while (choice != '5');
		System.out.println("THANK YOU FOR BANKING WITH US (:");
		System.out.println("/////////////////////////////////////");
		}

	
	
	
//		  balance+=amount;
//	        System.out.println("Deposited " +amount+ " to your account");
//	        System.out.println("Balance");

	void deposite (int amount) {
		if(amount !=0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw (int amount) {
		if(amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	
	void getpreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposited:" + previousTransaction);
		}else if(previousTransaction > 0) {
			System.out.println("withdrawn:" + Math.abs(previousTransaction));
		}else System.out.println(("No transaction occured"));
	}
	
	}
