package com.kodewala.interfacee;

/**
 * in 2010 - MMT
 */
public interface IBooking {

	// What to do.?
	public abstract Booking book();

	public abstract void cancelBooking();

	public abstract Booking checkStatus();

	SearchResult serch();

	// optional -- 2020
	public default void autoUpgrade() { // to some of the classes
		
		//500 lines (checking status, connecting with database(25 lines), upgrading)
		connecttoDB();
		System.out.println("IBooking.autoUpgrade()");
	}

	// optional -- 2020
	public default void sendNotification() { // to some of the classes
		
		//200 lines (connecting with database(25 lines), get user details and send notification
		connecttoDB();
		System.out.println("IBooking.sendNotification()");
	}
	
	//connect to database
	private static void connecttoDB() {
		
		System.out.println("IBooking.connecttoDB()");
	}

	// commmon or utility method
	public static void printTicket(String path, String contents) {

		// 200 lines --> printing the ticket
		connecttoDB();
		System.out.println("printing ticket.. static method");
	}
}
