package com.kodewala.shallo_deep_copy.practice01;

public class DeliveryLocation implements Cloneable{
	
	String houseNumber;
	String street;
	String city;
	
	public DeliveryLocation(String houseNumber, String street, String city) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
	}
	
//	//shallow copy
//	public Object clone() throws CloneNotSupportedException {
//		
//		return super.clone();
//	}
}
