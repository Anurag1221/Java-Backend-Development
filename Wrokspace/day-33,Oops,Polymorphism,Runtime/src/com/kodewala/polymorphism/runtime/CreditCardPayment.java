package com.kodewala.polymorphism.runtime;

public class CreditCardPayment extends Payment{
	
	@Override
	public void doPayment() {

		System.out.println("CreditCardPayment.doPayment()");
	}
}
