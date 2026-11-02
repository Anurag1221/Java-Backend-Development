package com.kodewala.interfacee.practice03;

public interface TemperatureMonitor {
	
	public abstract double readTemperature();
	public abstract boolean isTemperatureSafe(double temperature);
}
