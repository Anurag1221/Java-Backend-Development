package com.kodewala.interfacee.practice02;

public class SolarSmartMeter implements ISmartMeter {

	@Override
	public double readEnergyConsumption() {
		
		 return 150.5;
	}

	@Override
	public String getMeterSerialNumber() {
		
		return "SSM202";

	}

}
