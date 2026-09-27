package com.kodewala.practice;

public class GroceryItemDriver {

	public static void main(String[] args) {
		GroceryItem Gro1 = new GroceryItem();
		GroceryItem Gro2 = new GroceryItem(101, "Iphone");
		GroceryItem Gro3 = new GroceryItem(102, "vovo", 3, 100000);
		
		Gro1.displayDetails();
		Gro2.displayDetails();
		Gro3.displayDetails();
	}

}

//3. GroceryItem 🛒
//
//Create a GroceryItem class with:
//
//itemCode
//itemName
//quantity
//price
//
//Create constructors:
//
//GroceryItem()
//GroceryItem(int itemCode, String itemName)
//GroceryItem(int itemCode, String itemName, int quantity)
//GroceryItem(int itemCode, String itemName, int quantity, double price)
//
//Requirements:
//
//Use constructor chaining.
//Avoid repeating initialization code.
//Create a method to calculate the total price.
//Create 3 objects using different constructors.