package com.kodewala.interfacee.practice02;

public class Client {

	public static void main(String[] args) {
		
		//callig DigitalSmartMeter methods
		ISmartMeter iSmartMeter = new DigitalSmartMeter();
		double store = iSmartMeter.readEnergyConsumption();
		String store1 = iSmartMeter.getMeterSerialNumber();
		
		System.out.println("DigitalSmartMeter Meter Serial Number: " +store1);
		System.out.println("DigitalSmartMeter read Energy Consumption: " +store);

	}

}
