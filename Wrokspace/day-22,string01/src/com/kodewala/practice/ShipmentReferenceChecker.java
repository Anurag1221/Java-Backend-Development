package com.kodewala.practice;

public class ShipmentReferenceChecker {

	public static void main(String[] args) {
		
		String trackingId1 = new String("SHIP-90871"); // object 1 store in different address,do not located 1 address or location,like string literal 
		String trackingId2 = new String("SHIP-90871"); // object 2 store in different address,do not located 1 address or location,like string literal 
		
		System.out.println(trackingId1 == trackingId2); // String create using new keyword, == method compare the reference/address of object
		System.out.println(trackingId1.equals(trackingId2)); //String create using new keyword,  .equals method compare the content of object

	}

}
