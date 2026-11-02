package com.kodewala.interfacee.practice02;

public class DigitalSmartMeter implements ISmartMeter {

	@Override
	public double readEnergyConsumption() {

		return 95.8;
	}

	@Override
	public String getMeterSerialNumber() {

		return "DSM101";
	}

}
