package com.kodewla.control.flow;

public class Driver {

	public static void main(String[] args) {
		Booking booking = new Booking();
		
		String pnr = booking.doBooking("BLR", "DEHLI", 5);
		
		System.out.println("Pnr is :" + pnr);
	}

}
