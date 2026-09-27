package com.kodewala.practice;

public class HotelReservationDriver {

	public static void main(String[] args) {
		HotelReservation hotel1 = new HotelReservation();
		HotelReservation hotel2 = new HotelReservation(101,"Anurag","basic");
		HotelReservation hotel3 = new HotelReservation(102, "arth", "Good", 3);
		HotelReservation hotel4 = new HotelReservation(103, "arth", "Good", 3, 2000,300);
		
		hotel1.displayDetails();
		hotel2.displayDetails();
		hotel3.displayDetails();
		hotel4.displayDetails();

	}

}

//5. HotelReservation 🏨
//
//Create a HotelReservation class with:
//
//reservationId
//guestName
//roomType
//numberOfNights
//roomPrice
//extraCharges
//
//Create 5 overloaded constructors using constructor chaining.
//
//Requirements:
//
//The first constructor should accept only reservationId.
//Each next constructor should add more information.
//Use this() to chain constructors.
//Keep the main initialization logic in the final constructor.
//Create a method to calculate the total bill.
//Create at least 4 objects using different constructors.
//
//Challenge: Don't duplicate the same initialization logic in multiple constructors.
