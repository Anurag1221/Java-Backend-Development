package com.kodewala.interfacee.practice03;

public class TransportSensor implements TemperatureMonitor{

	@Override
	public double readTemperature() {
		// TODO Auto-generated method stub
		return 7.0;
	}

	@Override
	public boolean isTemperatureSafe(double temperature) {
		
		return  temperature >= 2.0 && temperature <= 6.0;
	}

}
