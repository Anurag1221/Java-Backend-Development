package com.kodewala.practice.whileloop;

import java.util.Scanner;

public class DeliveryOrderTracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter order status:");
            System.out.println("101 → Order Confirmed");
            System.out.println("102 → Restaurant Preparing");
            System.out.println("103 → Picked Up");
            System.out.println("104 → Out for Delivery");
            System.out.println("105 → Delivered");
            System.out.println("0 → Cancelled");
            System.out.println();

			System.out.println("Enter the order ID");
			int orderId = sc.nextInt();
		
			
			System.out.println("Order Id :" +orderId);
			
			if(orderId == 0) {
				System.out.println("Order Cancelled");
				break;
			}
			else if (orderId == 101) {
				System.out.println("Order Confirmed");
				break;
			}
			else if (orderId == 102) {
				System.out.println("Restaurant Preparing");
				break;
			}
			else if (orderId == 103) {
				System.out.println("Picked Up");
				break;
			}
			else if (orderId == 104) {
				System.out.println("Out for Delivery");
				break;
			}
			else if (orderId == 105) {
				System.out.println("Delivered");
				return;
			}
			else {
				System.out.println("Invalid status");
				continue;
			}
			
		}
		sc.close();
	}

}

//2. Food Delivery Order Tracker
//
//Create a class DeliveryOrderTracker.
//
//A food delivery order can move through these statuses:
//
//1 → Order Confirmed
//2 → Restaurant Preparing
//3 → Picked Up
//4 → Out for Delivery
//5 → Delivered
//0 → Cancelled
//Requirements:
//Use Scanner.
//Use a while loop.
//Ask the user for the current order status.
//Display the corresponding message.
//If status is 0, print "Order Cancelled" and use break.
//If status is 5, print "Order Delivered" and use return.
//For an invalid status, print "Invalid status" and use continue.
//
//Concepts: while, Scanner, break, continue, return
