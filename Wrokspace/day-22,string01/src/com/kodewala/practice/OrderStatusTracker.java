package com.kodewala.practice;

public class OrderStatusTracker {

	public static void main(String[] args) {
		
		String status = "PENDING";
		
		status.concat("-PAYMENT");//not assign in the main String
		
		System.out.println("Main String :" + status);//does not change the original String.
		
		status = status.concat("-PAYMENT"); // assign the content into main String,but this String create the new object
		
		System.out.println("Concat String (concat string create the new object):" +status);

	}

}
