package com.kodewala.objectStatic;

public class User {

	String userName;
	String userID;
	String mobileNumber;
	
	//static block will get executed just after the class loading.
	static {
		System.out.println("I am in static init block");
	}

	public User(String userName, String userID, String mobileNumber) {
		super();
		System.out.println("User.User(String userName, String userID, String mobileNumber).. Constructor");
		 this.userName = userName;
		this.userID = userID;
		this.mobileNumber = mobileNumber;
	}

}
