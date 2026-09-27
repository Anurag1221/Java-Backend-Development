package com.kodewala.practice;

public class BusPassDriver {

	public static void main(String[] args) {
		BusPass Bupa1 = new BusPass();
		BusPass Bupa2 = new BusPass(101,"Anurag");
		BusPass Bupa3 = new BusPass(102,"Arth","Temprary");
		
		Bupa1.displayDetails();
		Bupa2.displayDetails();
		Bupa3.displayDetails();
	}

}

//2. BusPass 🚌
//
//Create a BusPass class with:
//
//passNumber
//passengerName
//passType
//validityDays
//
//Create constructors:
//
//BusPass()
//BusPass(int passNumber, String passengerName)
//BusPass(int passNumber, String passengerName, String passType)
//BusPass(int passNumber, String passengerName, String passType, int validityDays)
//
//Requirements:
//
//Use this() chaining.
//Default passType should be "Regular".
//Default validity should be 30 days.
//Create at least 3 objects.
//Display pass information.
//3. GroceryItem 🛒
