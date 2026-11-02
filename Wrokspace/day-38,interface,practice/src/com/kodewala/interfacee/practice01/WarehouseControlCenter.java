package com.kodewala.interfacee.practice01;

public class WarehouseControlCenter {
	
	public static void main(String[] args) {
		
		StorageTemperatureMonitor monitor = new PharmaStorageMonitor();
		double pharmaTemp = monitor.readTemperature();
		boolean bool =  monitor.isTemperatureSafe(6);
		
		System.out.println("WarehouseControlCenter.main():" + pharmaTemp);
		System.out.println("WarehouseControlCenter.main():" +bool);
		
	}
}
