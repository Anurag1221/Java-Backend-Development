package com.kodewala.practice;

public class DuplicateTransactionStatus {

	public static void main(String[] args) {
		
		String status1 = "SUCCESS";
		String status2 = new String("SUCCESS");
		String status3 = status2.concat("");
		
		System.out.println(status1 == status2); // false // == compare the reference in string object
		System.out.println(status1.equals(status2)); // true // equals compare the content in String object
		System.out.println(status2 == status3); // true // java return the same object
		System.out.println(status2.equals(status3)); // true // content are same

	}

}
