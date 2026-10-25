package com.kodewala.polymorphism.practice02;

public class Client {

	public static void main(String[] args) {
		LoginController logincontroller = new LoginController();
		
		//calling FingerprintVerification
		FingerprintVerification fingerprintVerification = new FingerprintVerification();
		logincontroller.controller(fingerprintVerification, "Anurag1221");

	}

}
