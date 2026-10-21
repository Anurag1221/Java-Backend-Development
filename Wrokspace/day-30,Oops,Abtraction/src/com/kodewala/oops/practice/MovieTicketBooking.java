package com.kodewala.oops.practice;

public class MovieTicketBooking {

	private int availableSeats = 5;
	boolean bookingSuccessful = false;
	
	
	public void movieTicket() {
		
		checkSeatAvailability();
		bookSeat();
		displayBookingStatus();
	}
	
	private void checkSeatAvailability() {

		if (availableSeats <= 0) {
			System.out.println("Seat not Available");
		} else {
			System.out.println("Available Seats :" + availableSeats);
		}

	}

	private void bookSeat() {

		if (availableSeats > 0) {
			availableSeats--;
			bookingSuccessful = true;
			System.out.println("Ticket booked successfully.");
		} else {
			bookingSuccessful = false;
			System.out.println("Booking failed. No seats available.");
		}
	}

	private void displayBookingStatus() {

		  if (bookingSuccessful) {
	            System.out.println("Booking Status: Confirmed");
	        } else {
	            System.out.println("Booking Status: Failed");
	        }

	        System.out.println("Remaining Seats: " + availableSeats);
	}

}
