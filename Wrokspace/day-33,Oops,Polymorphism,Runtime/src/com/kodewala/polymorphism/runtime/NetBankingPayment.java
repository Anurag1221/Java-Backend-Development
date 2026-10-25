package com.kodewala.polymorphism.runtime;

public class NetBankingPayment extends Payment{
	
	@Override
	public void doPayment() {

		System.out.println("NetBankingPayment.doPayment()");
	}

}
