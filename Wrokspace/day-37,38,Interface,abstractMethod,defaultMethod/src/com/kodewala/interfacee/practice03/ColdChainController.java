package com.kodewala.interfacee.practice03;

public class ColdChainController {

	public static void main(String[] args) {

		// Warehouse temperature monitoring
		TemperatureMonitor monitor = new WarehouseSensor();

		double warehouseTemperature = monitor.readTemperature();

		System.out.println("Warehouse temperature: " + warehouseTemperature + "°C");

		if (monitor.isTemperatureSafe(warehouseTemperature)) {
			System.out.println("Warehouse temperature is safe.");
		} else {
			System.out.println("ALERT: Warehouse temperature is outside the permitted range!");
		}
	}
}
