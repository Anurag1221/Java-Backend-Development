package com.kodewala.polymorphism.practice02;

public class OTPVerification extends LoginVerification{
	
	@Override
	public void verifyUser(String username) {

		System.out.println("OTPVerification.verifyUser()");
	}
}
