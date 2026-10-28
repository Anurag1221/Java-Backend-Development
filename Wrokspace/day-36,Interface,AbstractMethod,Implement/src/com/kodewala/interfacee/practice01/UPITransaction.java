package com.kodewala.interfacee.practice01;

public class UPITransaction implements PaymentGateway{
	
	public void processPayment(double amount) {
		
		System.out.println("UPITransaction.processPayment() :" + amount);
	}
}
