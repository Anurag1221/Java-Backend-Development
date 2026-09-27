package com.kodewala.practice;

public class VehicleInsuranceDriver {

	public static void main(String[] args) {
		System.out.println("===== Object 1 =====");

		VehicleInsurance v1 = new VehicleInsurance();
		v1.displayDetails();

		System.out.println("===== Object 2 =====");

		VehicleInsurance v2 = new VehicleInsurance(101, "Anurag");
		v2.displayDetails();

		System.out.println("===== Object 3 =====");

		VehicleInsurance v3 = new VehicleInsurance(102, "Rahul", "MP20AB1234");
		v3.displayDetails();

		System.out.println("===== Object 4 =====");

		VehicleInsurance v4 = new VehicleInsurance(103,"Priya","MP20CD5678","Car","Comprehensive",7500,500000,3);
		v4.displayDetails();
	}
}



//7. VehicleInsurance 🚗
//
//Create a VehicleInsurance class with:
//
//policyId
//ownerName
//vehicleNumber
//vehicleType
//insuranceType
//premium
//coverageAmount
//policyDuration
//
//Create at least 5 overloaded constructors.
//
//Requirements:
//
//Use this() constructor chaining.
//Each constructor should provide progressively more information.
//The final constructor should contain the main initialization logic.
//Set appropriate default values for missing information.
//Create a method to calculate the final premium.
//Create a method to display complete policy details.
//Create at least 5 objects using different constructors.
//Do not duplicate initialization logic.
