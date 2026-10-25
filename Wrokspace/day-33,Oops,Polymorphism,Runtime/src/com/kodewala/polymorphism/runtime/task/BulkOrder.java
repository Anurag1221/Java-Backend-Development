package com.kodewala.polymorphism.runtime.task;

public class BulkOrder extends Order{
	
	@Override
	public void doOrder() {

		System.out.println("BulkOrder.doOrder()");
	}
}
