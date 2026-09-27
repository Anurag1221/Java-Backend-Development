package com.kodewala.practice;

public class ProductDriver {

	public static void main(String[] args) {
		Product Pro = new Product();
		Product Pro1 = new Product("Iphone", "Iphone ABC");
		Product Pro2 = new Product("Iphone", 10000, "Iphone ABC", 2);
		
		Pro.displayDetails();
		Pro1.displayDetails();
		Pro2.displayDetails1();
	}

}
