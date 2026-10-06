package com.kodewala.switchh;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer();
		
		System.out.println("Enter Member Type (Gold,Silver,Regular)");
		String memberType = sc.nextLine();
		
		System.out.println("Enter Order Amount");
		int orderAmount = sc.nextInt();
		
		customer.discount(memberType,orderAmount);
		
		sc.close();

	}
	
	//creation of discount method 
	public void discount(String memberType, int orderAmount) {
		
		if (orderAmount < 1000) {
			System.out.println("Minimum order amount is 1000");
			return;
		}

		int discount = 0;

		switch (memberType) {

		case "Gold":
			discount = orderAmount / 20;
			break;

		case "Silver":
			discount = orderAmount / 10;
			break;

		case "Regular":
			discount = orderAmount / 5;
			break;

		default:
			System.out.println("Invalid member type");
			return;
		}
		
		if (discount > 2500) {
			discount = 2500;
		}

		System.out.println("Order Amount : " + orderAmount);
		System.out.println("Discount : " + discount);

		int finalAmount = orderAmount - discount;

		System.out.println("Final Amount : " + finalAmount);
	}
	

}
