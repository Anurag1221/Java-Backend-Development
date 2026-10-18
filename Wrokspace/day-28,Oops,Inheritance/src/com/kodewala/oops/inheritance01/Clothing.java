package com.kodewala.oops.inheritance01;

public class Clothing extends Product{
	
	String size;
	String price;
	
	public Clothing(String productName, String description, int quantity, String status, String size, String price) {
	
		super(productName, description, quantity, status);
		
		this.size = size;
		this.price = price;
	}
	
	public void viewClothingProduct() {
		
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		
		System.out.println(size);
		System.out.println(price);
	}
	
	
	
	
	
}
