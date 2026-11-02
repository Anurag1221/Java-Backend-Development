package com.kodewala.interfacee;

public class Driver {

	public static void main(String[] args) 
	{
       IBooking booking = new TrainBooking();	
       booking.autoUpgrade();

	}

}
