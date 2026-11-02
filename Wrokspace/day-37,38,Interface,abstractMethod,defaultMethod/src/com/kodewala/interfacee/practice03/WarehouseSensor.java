package com.kodewala.interfacee.practice03;

public class WarehouseSensor implements TemperatureMonitor{

	@Override
	public double readTemperature() {
		
		return 5.5;
	}

	@Override
	public boolean isTemperatureSafe(double temperature) {
		
		return  temperature >= 2.0 && temperature <= 8.0;
	}

}
