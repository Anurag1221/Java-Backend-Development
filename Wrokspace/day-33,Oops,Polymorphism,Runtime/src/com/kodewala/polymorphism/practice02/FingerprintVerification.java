package com.kodewala.polymorphism.practice02;

public class FingerprintVerification extends LoginVerification{
	
	@Override
	public void verifyUser(String username) {

		System.out.println("FingerprintVerification.verifyUser()");
	}

}
