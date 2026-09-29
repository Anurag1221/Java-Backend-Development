package com.kodewla.control.practice;

public class OrderStatusTracker {
	
	public int orderStatus(int statusCode) {
		
		if(statusCode == 101) {
			
			System.out.println("Order Received");
			
		}else if(statusCode == 102) {
			
			System.out.println("Restaurant Accepted");
			
		}else if (statusCode == 103){
			
			System.out.println("Food Being Prepared");
			
		}else if (statusCode == 104){
			
			System.out.println("Out for Delivery");
			
		}else if(statusCode == 105) {
			
			System.out.println("Delivered");
			
		}else {
			
			System.out.println("Invalid status");
			
		}
		
		return 0;
	}
}
