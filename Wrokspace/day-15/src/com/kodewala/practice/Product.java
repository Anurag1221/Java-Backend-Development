package com.kodewala.practice;

public class Product {
	
	String productName;
	int price;
	
	Product(String _productName,int _price){
		this.productName = _productName;
		this.price = _price;
	}
	
	void calculatePrice() {
		System.out.println("Product Name ;" + productName);
		System.out.println("Orignal Price ;" + price);
	}
}

class DiscountedProduct extends Product{
	int discount;
	
	DiscountedProduct(String _productName, int _price, int _discount){
		super(_productName, _price);
		this.discount = _discount;
	}
	
	void calculate() {
		super.calculatePrice();
		System.out.println("Discount;" + (discount));
		System.out.println("Discounted Price ;" + (super.price-discount));
	}
	
}

//5. Product Price Override
//
//Create a parent class Product:
//
//productName
//price
//Method calculatePrice() that prints the original price.
//
//Create a child class DiscountedProduct:
//
//discount
//
//Requirements:
//
//Initialize parent fields using super().
//Override calculatePrice().
//Inside the child method, call the parent version using super.calculatePrice().
//Calculate and display the discounted price.
//
//Focus: super.method() inside an overridden method.
