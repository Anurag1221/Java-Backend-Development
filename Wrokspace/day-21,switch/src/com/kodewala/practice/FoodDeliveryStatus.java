package com.kodewala.practice;

import java.util.Scanner;

public class FoodDeliveryStatus {

	public static void main(String[] args) {
		//create scanner for taking the of user side
		Scanner sc = new Scanner(System.in);
		
		//creation of object
		FoodDeliveryStatus delivery  = new FoodDeliveryStatus();
		
		System.out.println("Check the order status,Enter order ID (1-5)");
		int number = sc.nextInt();
		
		//call the methods
		delivery.OrderStatus(number);
		
	sc.close();

}
	
//creation the method for order status
public void OrderStatus(int number) {
		
		//using switch checking the order status
		switch (number) {
		case 1:
			System.out.println("Order Placed");
			break;
		case 2:
			System.out.println("Restaurant Accepted");
			break;
		case 3:
			System.out.println("Food Preparing");
			break;
		case 4:
			System.out.println("Out for Delivery");
			break;
		case 5:
			System.out.println("Delivered");
			break;	
		default:
			System.out.println("Invalid Order ID");
				break;
		}
	}

}


