package com.kodewala.polymorphism.practice02;

public class TransactionAlert extends SecurityAlert{
	
	@Override
	public void sendAlert() {
		
		System.out.println("TransactionAlert.sendAlert()");
	}

}
