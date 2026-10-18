package com.kodewala.practice;

class ShipmentTrackingBase {

	String trackingCode;

	public ShipmentTrackingBase(String trackingCode) {
		super();
		this.trackingCode = trackingCode;
	}
	
}

public class ColdChainShipment extends ShipmentTrackingBase{
	
	String temperatureCelsius;

	public ColdChainShipment(String trackingCode, String temperatureCelsius) {
		super(trackingCode);
		this.temperatureCelsius = temperatureCelsius;
	}
	
	public void displayStatus(){
		
		System.out.println(trackingCode);
		System.out.println(temperatureCelsius);
	}
	
}
