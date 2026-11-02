package com.kodewala.interfacee.practice01;

public interface StorageTemperatureMonitor {
	
	public abstract double readTemperature();
	public abstract boolean isTemperatureSafe(double temperature);
}
