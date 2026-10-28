package com.kodewala.interfacee.practice01;

public class CheckoutService {
	
	public static void main(String[] args) {
		
		//calling the UPITransaction method using parent interface
		PaymentGateway gateway = new UPITransaction();
		gateway.processPayment(1500);
		
		//calling the UPITransaction method using parent interface
		PaymentGateway gateway01 = new CreditCardTransaction();
		gateway01.processPayment(2000);
				
	}
}
