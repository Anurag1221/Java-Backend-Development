package com.kodewala.practice;

public class CustomerLocationChecker {

	public static void main(String[] args) {
		
		String city1 = "Bangalore";
		String city2 = "Bangalore";
		String city3 = new String("Bangalore");
		
		System.out.println(city1 == city2); // true ,reference is same 
		System.out.println(city1.equals(city2)); // true ,content is same
		
		System.out.println(city1==city3); //false ,reference is different ,
										 //(city1) String literal object same in String pool
										 //(city3) String object same in heap memory
		
		System.out.println(city1.equals(city3)); // true ,because content are same
												//in String ,equals compare the content
												// and in other like create user object so ,equals compare the reference
		
		
		System.out.println(city2 == city3); //false, == compare the reference
		System.out.println(city2.equals(city3)); //true, equals compare the content in String

	}

}
