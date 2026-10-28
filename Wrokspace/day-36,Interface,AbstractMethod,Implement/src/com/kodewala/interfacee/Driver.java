package com.kodewala.interfacee;

public class Driver {

	public static void main(String[] args) {
		FlightBooking booking = new FlightBooking();
		
		int discount = booking.calculateDiscount(1000, 10);
		
		System.out.println("Discount is :" + discount);
		
		booking.calculateDiscountTax(1000);
		
		//Down-Casting
		FlightBooking booking2 = (FlightBooking) booking;

	}

}
