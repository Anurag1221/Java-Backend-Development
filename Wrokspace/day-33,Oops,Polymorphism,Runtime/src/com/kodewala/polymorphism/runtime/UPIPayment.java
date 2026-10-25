package com.kodewala.polymorphism.runtime;

public class UPIPayment extends Payment{
	
	@Override
	public void doPayment() {

		System.out.println("UPIPayment.doPayment()");
	}
}
