package com.kodewala.practice;

public class BusPass {
	int passNumber;
	String passengerName;
	String passType;
	int validityDays;
	
	BusPass(){
		this(0, "Unknown");
		System.out.println("call first constructor");
	}
	
	BusPass(int _passNumber, String _passengerName){
		
		this(_passNumber, _passengerName, "Regular");
		System.out.println("call second constructor");
	}
	
	BusPass(int _passNumber, String _passengerName, String _passType){
		
		this(_passNumber, _passengerName, _passType, 30);
		System.out.println("call third constructor");
	}
	
	BusPass(int _passNumber, String _passengerName, String _passType, int _validityDays){
		
		passNumber = _passNumber;
		passengerName = _passengerName;
		passType = _passType;
		validityDays = _validityDays;
		System.out.println("call fourth constructor");
	}
	
	void displayDetails() {
		System.out.println("passNumber :" + passNumber);
		System.out.println("passengerName :" + passengerName);
		System.out.println("passType :" + passType);
		System.out.println("validityDays :" + validityDays);
		System.out.println();
	}
}


