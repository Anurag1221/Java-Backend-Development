package com.kodewala.constructor;

class SuperUser extends Object {
	SuperUser(){
		super(); // calling super class no args constructor
		//execute remaining step if any
	}
}

public class User {
	String userName;
	String userId;
	String mobile;

	User(String _userName, String _userId, String _mobile) {
		super(); //calling super calss constructor without arg.
		//first line of constructor is either super or this. If you are not writing super or this.
		//then compiler will consuder super()
		
		//this(300);
		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
	}

	User(int age) {
		System.out.println("User.User() no arg");
	}
}
