package com.kodewala.practice;

public class Vehicle {
	String brand;
	int price;
	
	Vehicle(String _brand, int _price){
		
		this.brand = _brand;
		this.price = _price;
	}
	
}

class Car extends Vehicle{
	String model;
	
	Car(String brand,int price,String _model){
		
		super(brand, price);
		this.model = _model;	
	}
	
	void displayCar() {
		System.out.println("brand :" + brand);
		System.out.println("price :" + price);
		System.out.println("model :" + model);
	}
}


//2. Vehicle Details
//
//Create a parent class Vehicle:
//
//brand
//price
//
//Create a child class Car:
//
//model
//Create a constructor for all three values.
//Use super to initialize brand and price.
//Display the details.
//
//Focus: super for accessing the parent constructor.