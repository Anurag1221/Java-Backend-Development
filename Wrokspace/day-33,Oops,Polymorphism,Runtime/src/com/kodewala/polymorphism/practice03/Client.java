package com.kodewala.polymorphism.practice03;

public class Client {

	public static void main(String[] args) {
		
		ChargingManager chargingManager = new ChargingManager();
		
		FastChargingStation fastChargingStation = new FastChargingStation();
		chargingManager.managerCharge(fastChargingStation, 80);

	}

}
