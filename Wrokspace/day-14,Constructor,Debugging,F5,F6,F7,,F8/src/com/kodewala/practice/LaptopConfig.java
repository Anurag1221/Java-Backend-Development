package com.kodewala.practice;

public class LaptopConfig {
	String model;
	String brand;
	int ram;
	int storage;
	
	LaptopConfig(){
		this("B101","Iphone");
		System.out.println("call first constructor");
	}
	
	LaptopConfig(String _model, String _brand){
		
		this(_model, _brand, 8);
		System.out.println("second first constructor");
	}
	
	LaptopConfig(String _model, String _brand, int _ram){
		
		this(_model, _brand, _ram, 256);
		System.out.println("call third constructor");
	}
	
	LaptopConfig(String _model, String _brand, int _ram, int _storage){
		
		model = _model;
		brand = _brand;
		ram = _ram;
		storage = _storage;
		System.out.println("call fourth constructor");
	}
	
	void displayDetails() {
		System.out.println("model :" + model);
		System.out.println("brand :" + brand);
		System.out.println("ram :" + ram);
		System.out.println("storage :" + storage);
		System.out.println();
	}
}

//1. LaptopConfig 💻

//Create a LaptopConfig class with:
//
//model
//brand
//ram
//storage
//
//Create 4 constructors:
//
//LaptopConfig()
//LaptopConfig(String model, String brand)
//LaptopConfig(String model, String brand, int ram)
//LaptopConfig(String model, String brand, int ram, int storage)
//
//Requirements:
//
//Use this() for constructor chaining.
//Give default values when information is not provided.
//Create 3 objects using different constructors.
//Display all details.
