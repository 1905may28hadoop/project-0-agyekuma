package com.revature.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class modelStream {

	private int CustomerId;
	private String FirstName;
	private String LastName;
	private String Address;
	private String State;
	private String Country;
	private String Phone;
	private String email;
	private static int Balance;
	private int AccountId;
	private String Password;
	
	public modelStream(int customerId, String firstName, String lastName, String address, String state, String country,
			String phone, String email, int balance, int accountId, String password) {
		super();
		this.CustomerId = customerId;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Address = address;
		this.State = state;
		this.Country = country;
		this.Phone = phone;
		this.email = email;
		this.Balance = balance;
		this.AccountId = accountId;
		this.Password = password;
	}
	
	public modelStream(ResultSet resultSet) throws SQLException{
    this(resultSet.getInt("CustomerId"),
		resultSet.getString("FirstName"),
		resultSet.getString("LastName"),	
		resultSet.getString("Address"),		
		resultSet.getString("State"),	
		resultSet.getString("Country"),
		resultSet.getString("Phone"),
		resultSet.getString("email"),
		resultSet.getInt("Balance"),
		resultSet.getInt("AccountId"),
		resultSet.getString("Password")
				);
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static int getBalance() {
		return Balance;
	}

	public static void setBalance(int balance) {
		Balance = balance;
	}

	public int getAccountId() {
		return AccountId;
	}

	public void setAccountId(int accountId) {
		AccountId = accountId;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "modelStream [CustomerId=" + CustomerId + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", Address=" + Address + ", State=" + State + ", Country=" + Country + ", Phone=" + Phone + ", email="
				+ email + ", Balance=" + Balance + ", AccountId=" + AccountId + ", Password=" + Password + "]";
	}

	

	
	}

	
	
	
	
	
	

