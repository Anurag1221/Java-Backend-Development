package com.kodewala.polymorphism.runtime.task;

public class RetailOrder extends Order {

	@Override
	public void doOrder() {

		System.out.println("RetailOrder.doOrder()");
	}
}
