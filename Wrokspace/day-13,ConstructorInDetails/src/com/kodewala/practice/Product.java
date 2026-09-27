package com.kodewala.practice;

public class Product {
	String productName;
	int price;
	String description;
	int quantity;
	
	Product() {
		System.out.println("Product()");
	}
	
	Product(String _productName, String _description) {
		this.productName = _productName;
		this.description = _description;
	}

	Product(String _productName, int _price, String _description, int _quantity) {
		this.productName = _productName;
		this.price = _price;
		this.description = _description;
		this.quantity = _quantity;
	}
	
	void displayDetails() {

		System.out.println("Product Number :" + productName);
		System.out.println("description :" + description);
		System.out.println();
	}

	void displayDetails1() {

		System.out.println("Product Number :" + productName);
		System.out.println("Price :" + price);
		System.out.println("description :" + description);
		System.out.println("quantity :" + quantity);
		System.out.println();
	}
	
	
}

//4. Product Constructor Overloading
//
//Create a Product class with:
//
//productName
//price
//description
//quantity
//
//Create three constructors:
//
//Product()
//Product(String productName, String description)
//Product(String productName, int price, String description, int quantity)
//
//Create one object using each constructor and display the appropriate information.
