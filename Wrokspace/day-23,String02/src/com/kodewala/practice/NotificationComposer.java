package com.kodewala.practice;

public class NotificationComposer {

	public static void main(String[] args) {
		
		String user = "Payment"; // first String literal created 
		
		String add = user.concat(" successful"); // first String literal Created and concat into second, Second String creted and store in heap memory
		
		String order = add.concat(" for order ORD4582"); // third String created and concat first and second ,and store in heap memory
		
		System.out.println(user); // print first String
		System.out.println(add); // print first + second String
		System.out.println(order); // print first + second + third Strong 
		

	}

}
