package com.kodewala.interfacee.practice05;

public class OxygenSupplyMonitor implements EquipmentHealthMonitor{
	
	private String equipmentId;
    private String equipmentLocation;
    private double oxygenLevel;
    
    
	public OxygenSupplyMonitor(String equipmentId, String equipmentLocation, double oxygenLevel) {
		super();
		this.equipmentId = equipmentId;
		this.equipmentLocation = equipmentLocation;
		this.oxygenLevel = oxygenLevel;
	}

	@Override
	public double readEquipmentValue() {
		
		return oxygenLevel;
	}

	@Override
	public boolean isWithinSafeRange(double value) {
		
		return value >= 90 && value <= 100;
	}
	
	@Override
	public void displayEquipmentStatus() {

		System.out.println("\\n--- Oxygen Supply Details ---");
		System.out.println("Equipment ID: " + equipmentId);
		System.out.println("Location: " + equipmentLocation);
		System.out.println("Oxygen Level: " + readEquipmentValue() + "%");

		EquipmentHealthMonitor.super.displayEquipmentStatus();
	}


}
