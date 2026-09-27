package com.kodewala.practice;

public class HotelReservation {
	int reservationId;
	String guestName;
	String roomType;
	int numberOfNights;
	int roomPrice;
	int extraCharges;	
	
	HotelReservation(){
		this(0, "Unknown");
		System.out.println("call first constructor");
	}
	
	HotelReservation(int _reservationId, String _guestName){
		
		this(_reservationId, _guestName, "unknown");
		System.out.println("call second constructor");
	}
	
	HotelReservation(int _reservationId, String _guestName, String _roomType){
		
		this(_reservationId, _guestName, _roomType, 1);
		System.out.println("call third constructor");
	}
	
	HotelReservation(int _reservationId, String _guestName, String _roomType, int _numberOfNights){
		
		this(_reservationId, _guestName, _roomType, _numberOfNights, 1);
		System.out.println("call fourth constructor");
	}
	
	HotelReservation(int _reservationId, String _guestName, String _roomType, int _numberOfNights, int _roomPrice){
		
		this(_reservationId, _guestName, _roomType, _numberOfNights, _roomPrice, 100);
		System.out.println("call fifth constructor");
	}
	
	HotelReservation(int _reservationId, String _guestName, String _roomType, int _numberOfNights, int _roomPrice, int _extraCharges){
		
		reservationId = _reservationId;
		guestName = _guestName;
		roomType = _roomType;
		numberOfNights = _numberOfNights;
		roomPrice = _roomPrice;
		extraCharges = _extraCharges;
		System.out.println("call sixth constructor");
	}
	
	void displayDetails() {
		System.out.println("reservationId :" + reservationId);
		System.out.println("guestName :" + guestName);
		System.out.println("roomType :" + roomType);
		System.out.println("numberOfNights :" + numberOfNights);
		System.out.println("roomPrice :" + roomPrice);
		System.out.println("extraCharges :" + extraCharges);
		System.out.println("Total Rent :" + (numberOfNights*roomPrice*extraCharges));
		System.out.println();
	}
}
