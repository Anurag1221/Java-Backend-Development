package com.kodewala.practice;

public class OrderReferenceValidator {

	public static void main(String[] args) {
		
		String orderId1 = "ORD-45821";
		String orderId2 = "ORD-45821";
		
		System.out.println(orderId1 == orderId2); // In the String literal == method compare the reference/address of object
		System.out.println(orderId1.equals(orderId2)); //In the String literal .equals method compare the content of object  

	}

}
