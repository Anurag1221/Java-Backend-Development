package com.kodewala.polymorphism.practice03;

public class FastChargingStation extends ChargingStation{
	
	@Override
	public void startCharging(int batteryPercentage) {

		System.out.println("FastChargingStation.startCharging() :" + batteryPercentage);
	}
}
