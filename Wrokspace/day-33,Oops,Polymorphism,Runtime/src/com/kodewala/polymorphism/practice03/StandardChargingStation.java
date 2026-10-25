package com.kodewala.polymorphism.practice03;

public class StandardChargingStation extends ChargingStation{
	
	@Override
	public void startCharging(int batteryPercentage) {

		System.out.println("StandardChargingStation.startCharging() :" + batteryPercentage);
	}

}
