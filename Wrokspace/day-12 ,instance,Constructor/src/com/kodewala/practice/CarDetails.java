package com.kodewala.practice;

public class CarDetails {
	
	int carNumber;
	String brand;
	String model;
	String color;
	int price;
		
	CarDetails(int _carNumber, String _brand,String _model,String _color, int _price){
		 
		carNumber = _carNumber;
		brand = _brand;
		model = _model;
		color = _color;
		price = _price;
	}
	
	void displayDetails() {
		System.out.println("Car Number :" + carNumber);
		System.out.println("brand :" + brand);
		System.out.println("model :" + model);
		System.out.println("color :" + color);
		System.out.println("price :" + price);
		System.out.println();
	}
}

//6. Car
//Create a Car class with:
//
//carNumber
//brand
//model
//color
//price
//
//Create 3 car objects. Change the color of only the second car and display all cars again.