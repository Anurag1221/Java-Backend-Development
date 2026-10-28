package com.kodewala.interfacee.practice01;

public class CreditCardTransaction implements PaymentGateway {

	public void processPayment(double amount) {

		System.out.println("CreditCardTransaction.processPayment() :" + amount);
	}

}
