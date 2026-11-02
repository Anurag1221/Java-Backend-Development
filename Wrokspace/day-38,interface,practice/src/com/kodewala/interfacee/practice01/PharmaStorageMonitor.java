package com.kodewala.interfacee.practice01;

public class PharmaStorageMonitor implements StorageTemperatureMonitor{

	@Override
	public double readTemperature() {
		// TODO Auto-generated method stub
		return 5.5;
	}

	@Override
	public boolean isTemperatureSafe(double temperature) {
		// TODO Auto-generated method stub
		return  temperature >= 2 && temperature <= 8;
	}

}
