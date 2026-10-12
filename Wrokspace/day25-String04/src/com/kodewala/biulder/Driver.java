package com.kodewala.biulder;

// StringBuilder objects are mutable
public class Driver {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("kodewala"); // StringBiulder object --> mutable
		
		StringBuilder sb1 = new StringBuilder("kodewala");
		
		//sb.append(" Academy");
		
		for (int i = 0; i < 10; i++) { // same object is modified,not new object created
			
			//sb.append(" Academy");
		}
		
		System.out.println(sb.equals(sb1));// false // in StringBuilder object --> equals method compare the reference
		System.out.println(sb.toString().equals(sb1.toString()));//true //In String object --> equals method compare the content
	}

}
