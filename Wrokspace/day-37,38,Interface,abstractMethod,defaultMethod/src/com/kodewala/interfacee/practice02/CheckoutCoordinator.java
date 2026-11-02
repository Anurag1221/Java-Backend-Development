package com.kodewala.interfacee.practice02;

public class CheckoutCoordinator {
	
	public static void main(String[] args) {
		
		double amount = 1500.00;
		
		 // UPI payment
        PaymentGateway gateway = new UPIProcessor();
        
        String upiTransactionId = gateway.processPayment(amount);
        System.out.println("UPI Transaction ID: " + upiTransactionId);
	}
}
