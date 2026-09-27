package com.kodewala.practice;

public class GroceryItem {
	int itemCode;
	String itemName;
	int quantity;
	int price;
	
	GroceryItem(){
		this(0, "Unknown");
		System.out.println("call first constructor");
	}
	
	GroceryItem(int _itemCode, String _itemName){
		
		this(_itemCode, _itemName, 0);
		System.out.println("call second constructor");
	}
	
	GroceryItem(int _itemCode, String _itemName, int _quantity){
		
		this(_itemCode, _itemName, _quantity, 0);
		System.out.println("call third constructor");
	}
	
	GroceryItem(int _itemCode, String _itemName, int _quantity, int _price){
		
		itemCode = _itemCode;
		itemName = _itemName;
		quantity = _quantity;
		price = _price;
		System.out.println("call fourth constructor");
	}
	
	void displayDetails() {
		System.out.println("itemCode :" + itemCode);
		System.out.println("itemName :" + itemName);
		System.out.println("quantity :" + quantity);
		System.out.println("price :" + price);
		System.out.println("Total Price :" + (quantity*price));
		System.out.println();
	}
}
