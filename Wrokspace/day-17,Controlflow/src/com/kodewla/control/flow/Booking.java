package com.kodewla.control.flow;

/*This class is resposiable for accepting booking from user. */

public class Booking {
	
	//More than-6 pax per PNR is not allowed
	public String doBooking(String from, String to, int noOfPax) {
			
		String pnr = null;
			
		if(noOfPax > 6) {
			//do not allow to book
			System.err.println("As per IRCTC policy, only 6 pax are allowed per pnr");
		}else {
			//Confirming the booking
			pnr = "784786753";
			System.out.println("confirming the booking :" + pnr);
			System.out.println("STATUS : COMFIRMED");
			System.out.println("	SEAT : 23 A1");
		}
		
		return pnr;
	}

}
