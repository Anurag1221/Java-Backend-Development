 package com.kodewala.polymorphism.practice02;

public class LoginAlert extends SecurityAlert{
	
	@Override
	public void sendAlert() {
		
		System.out.println("LoginAlert.sendAlert()");
	}
}
