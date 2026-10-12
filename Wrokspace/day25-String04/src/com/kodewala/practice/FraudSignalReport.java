package com.kodewala.practice;

public class FraudSignalReport {

	public static void main(String[] args) {
		
		StringBuilder first = new StringBuilder("RISK_HIGH");
		StringBuilder second = new StringBuilder("RISK_HIGH");
		
		System.out.println(first == second); // false ,both StringBuilder object store in heap memory but in different address
		System.out.println(first.equals(second)); // false, reference are different, in String object -->equals method compare the content  
		System.out.println(first.toString().equals(second.toString()));//true // StringBuilder object convert into String object, so equals compare the content

	}

}
