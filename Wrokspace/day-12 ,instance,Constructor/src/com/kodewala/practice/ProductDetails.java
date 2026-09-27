package com.kodewala.practice;

public class ProductDetails {
	int productId;
	String productName;
	int price;
    int quantity;
	
		
	ProductDetails(int _productId, String _productName,int _price,int _quantity){
		 
		productId = _productId;
		productName = _productName;
		price = _price;
		quantity = _quantity;
	}
	
	void displayDetails() {
		System.out.println("product Id :" + productId);
		System.out.println("product Name :" + productName);
		System.out.println("price :" + price);
		System.out.println("quantity :" + quantity);
		System.out.println("Total Price :" + (price*quantity));
		System.out.println();
	}
}

//7. Product
//Create a Product class with:
//
//productId
//productName
//price
//quantity
//
//Create 3 product objects. Display each product's details and calculate the total price using price × quantity.
