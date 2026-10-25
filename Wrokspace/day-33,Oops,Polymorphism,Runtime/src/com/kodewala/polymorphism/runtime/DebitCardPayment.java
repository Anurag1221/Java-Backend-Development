package com.kodewala.polymorphism.runtime;

public class DebitCardPayment extends Payment{
	
	@Override
	public void doPayment() {

		System.out.println("DebitCardPayment.doPayment()");
	}

}
