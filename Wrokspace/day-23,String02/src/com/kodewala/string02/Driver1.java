package com.kodewala.string02;

public class Driver1 {

	public static void main(String[] args) {
		
		String s = "kodewala";// --> store in scp
		//in case i want to change
		
		String s2 = s.concat(" Academy"); // trying to change the object
										 // object created in heap with content kodewala Academy
		
		System.out.println(s2);

	}

}
