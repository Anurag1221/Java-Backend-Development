package com.kodewala.polymorphism.runtime.task;

public class OfflineOrder extends Order{
	
	@Override
	public void doOrder() {

		System.out.println("OfflineOrder.doOrder()");
	}
}
