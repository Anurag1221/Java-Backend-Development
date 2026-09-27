package com.kodewala.practice;

public class ProductDriver {

	public static void main(String[] args) {
		
		ProductDetails Driver1 = new ProductDetails(101, "Shampoo", 99, 3);
		ProductDetails Driver2 = new ProductDetails(102, "Face Wash", 110, 5);
		ProductDetails Driver3 = new ProductDetails(103, "Coconut oil", 190, 4);
		
		Driver1.displayDetails();
		Driver2.displayDetails();
		Driver3.displayDetails();
	}

}
