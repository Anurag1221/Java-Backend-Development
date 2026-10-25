package com.kodewala.polymorphism.runtime.task;

public class EcommerceOrder extends Order{
	
	@Override
	public void doOrder() {

		System.out.println("EcommerceOrder.doOrder()");
	}
}
