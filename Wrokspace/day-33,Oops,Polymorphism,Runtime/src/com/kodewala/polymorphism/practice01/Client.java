package com.kodewala.polymorphism.practice01;

public class Client {

	public static void main(String[] args) {

		DispatchCoordinator dispatchcoordinator = new DispatchCoordinator();

		// calling the ElectricScooterDispatch class
		ElectricScooterDispatch electric = new ElectricScooterDispatch();
		dispatchcoordinator.coordinator(electric, 5);

		// calling the ElectricScooterDispatch class
		BikeDispatch Bike = new BikeDispatch();
		dispatchcoordinator.coordinator(Bike, 10);
	}
}
