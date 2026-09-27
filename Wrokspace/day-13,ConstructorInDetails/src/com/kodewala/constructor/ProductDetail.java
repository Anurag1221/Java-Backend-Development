package com.kodewala.constructor;

public class ProductDetail {
	String productName;
	int price;
	String description;
	int quantity;
	
	ProductDetail(){
		System.out.println("ProdusctsDetails()");
	}
		
	ProductDetail(String _productName, int _price,String _description,int _quantity){
		 
		this.productName = _productName;
		this.price = _price;
		this.description = _description;
		this.quantity = _quantity;
	}
	
	ProductDetail(String _productName,String _description){
		 
		this.productName = _productName;
		this.description = _description;
	}
	
	void displayDetails() {
		System.out.println("productName :" + productName);
		System.out.println("price :" + price);
		System.out.println("Description :" + description);
		System.out.println("quantity :" + quantity);
		System.out.println();
	}
	
	void displayDetails1() {
		System.out.println("productName :" + productName);
		System.out.println("Description :" + description);
		System.out.println();
	}
}
