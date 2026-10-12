package com.kodewala.practice;

public class CaseSensitiveAccess {

	public static void main(String[] args) {
		
		String storedToken = "AuthX9";
		String receivedToken = new String("authx9");
		
		System.out.println(storedToken.equals(receivedToken)); // false // equals compare the content
		System.out.println(storedToken.equalsIgnoreCase(receivedToken));//true // equalsIgnoreCase --> compare content aslo but upper case and lower case both are same 

	}

}
