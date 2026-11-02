package com.kodewala.interfacee.practice01;

public class FoodStorageMonitor implements StorageTemperatureMonitor{

	@Override
	public double readTemperature() {
		
		return 4.5;
	}

	@Override
	public boolean isTemperatureSafe(double temperature) {
		
		return temperature >= 0 && temperature <= 5;
	}

}
