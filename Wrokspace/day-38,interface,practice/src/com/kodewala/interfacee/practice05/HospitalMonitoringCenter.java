package com.kodewala.interfacee.practice05;

public class HospitalMonitoringCenter {
	
	public static void main(String[] args) {
		
		//calling VentilatorMonitor method
		EquipmentHealthMonitor ventilator = new VentilatorMonitor("VEN101", "ICU Room 1", 25);
		 ventilator.displayEquipmentStatus();
		 
		//calling OxygenSupplyMonitor method
		 EquipmentHealthMonitor ventilator01 = new OxygenSupplyMonitor("OXY202", "ICU Room 2", 90);
		 ventilator01.displayEquipmentStatus();
	}
}
