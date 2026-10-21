package com.kodewala.method.overloading;

//Method OverRiding use within the class only
// same method name but different parameter 
public class Login {

	public void doLogin(String mobile, String otp) { // v1

		System.out.println("Login.doLogin(String mobile, String otp)");
	}

	public void doLogin(String email, int password) { // v2

		System.out.println("Login.doLogin(String email, int password)");
	}

	public void doLogin(String gamil) { // v3

		System.out.println("Login.doLogin(String gamil)");
	}
	
}
