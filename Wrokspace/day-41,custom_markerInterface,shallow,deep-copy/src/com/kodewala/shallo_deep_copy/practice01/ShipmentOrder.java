package com.kodewala.shallo_deep_copy.practice01;

public class ShipmentOrder implements Cloneable{
	
	String orderId;
	String customerName;
	DeliveryLocation deliveryLocation;
	
	public ShipmentOrder(String orderId, String customerName, DeliveryLocation deliveryLocation) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.deliveryLocation = deliveryLocation;
	}
	
	
	//Deep copy
	public Object clone() throws CloneNotSupportedException {
		
		 return super.clone();
	}
	
}
