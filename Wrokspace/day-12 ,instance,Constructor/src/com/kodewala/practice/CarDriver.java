 package com.kodewala.practice;

public class CarDriver {

	public static void main(String[] args) {
		
		CarDetails CarDe1 = new CarDetails(2001, "BMW", "M5", "Black", 2000000);
		CarDetails CarDe2 = new CarDetails(2002, "Lambo", "A5", "Brown", 4000000);
		CarDetails CarDe3 = new CarDetails(2003, "Supra", "G5", "Yellow", 7000000);
		
		CarDe1.displayDetails();
		CarDe2.displayDetails();
		CarDe3.displayDetails();
	}

}
