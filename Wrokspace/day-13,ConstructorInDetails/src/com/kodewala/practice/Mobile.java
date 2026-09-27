package com.kodewala.practice;

public class Mobile {
	String brand;
    String model;
    int price;
    int ram;

    // 1. No-argument constructor
    Mobile() {
        this("Samsung");
        System.out.println("Mobile() constructor called");
    }

    // 2. One-parameter constructor
    Mobile(String brand) {
        this(brand, "Galaxy S24");
        System.out.println("Mobile(String brand) constructor called");
    }

    // 3. Two-parameter constructor
    Mobile(String brand, String model) {
        this(brand, model, 60000, 8);
        System.out.println("Mobile(String brand, String model) constructor called");
    }

    // 4. Four-parameter constructor
    Mobile(String brand, String model, int price, int ram) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;

        System.out.println("Mobile(String, String, int, int) constructor called");
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("RAM: " + ram + " GB");
    }
}

//5. Constructor Chaining Using this()
//
//Create a Mobile class with:
//
//brand
//model
//price
//ram
//
//Create these constructors:
//
//Mobile()
//Mobile(String brand)
//Mobile(String brand, String model)
//Mobile(String brand, String model, int price, int ram)
//
//Requirements:
//
//Mobile() should call Mobile(String brand) using this().
//Mobile(String brand) should call Mobile(String brand, String model).
//Mobile(String brand, String model) should call the four-parameter constructor.
//Print a message from every constructor so you can observe the constructor execution order.