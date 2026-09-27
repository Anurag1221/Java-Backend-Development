package com.kodewala.constructor;

public class ProductDriver {

	public static void main(String[] args) {

		ProductDetail Driver1 = new ProductDetail("Ihpone", 100000, "Iphone ABC", 2);
		ProductDetail Driver2 = new ProductDetail("Vivo", "Vivo ABC");
		ProductDetail Driver3 = new ProductDetail();

		Driver1.displayDetails();
		Driver2.displayDetails1();
		Driver3.displayDetails();
	}

}

/*
 * Task: Write a program to create Product object and consider the following
 * scenario. Attributes:
 * 
 * ProductName, Price, Description, Quantity
 * 
 * Scenario: a. User should be able to create the product with product name,
 * price, description and quantity.
 * 
 * b. User should be able to create the product with product name, description.
 * 
 * c. User should be able to create product without any attributes.
 * 
 * d. Print the attributes for each objects.
 * 
 * Note: Follow java naming convention.
 */
