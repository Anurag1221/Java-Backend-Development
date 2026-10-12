package com.kodewala.practice;

public class PaymentGateway {

	public static void main(String[] args) {
		
		String message1 = "Payment " + "completed";
		String message2 = "Payment completed";

		System.out.println(message1 == message2); // true ,Literal + literal → compile-time concatenation. 
		System.out.println(message1.equals(message2));										//Same pooled literal → same object reference.
											    //== checks references; .equals() checks content.
	}

}
