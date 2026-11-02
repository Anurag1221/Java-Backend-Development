package com.kodewala.interfacee.practice05;

public class VentilatorMonitor implements EquipmentHealthMonitor {

	private String equipmentId;
	private String equipmentLocation;
	private double breathingRate;

	public VentilatorMonitor(String equipmentId, String equipmentLocation, double breathingRate) {
		super();
		this.equipmentId = equipmentId;
		this.equipmentLocation = equipmentLocation;
		this.breathingRate = breathingRate;
	}

	@Override
	public double readEquipmentValue() {
		return breathingRate;
	}

	@Override
	public boolean isWithinSafeRange(double value) {

		return value >= 12 && value <= 25;
	}

	@Override
	public void displayEquipmentStatus() {

		System.out.println("\n--- Ventilator Details ---");
		System.out.println("Equipment ID: " + equipmentId);
		System.out.println("Location: " + equipmentLocation);
		System.out.println("Breathing Rate: " + readEquipmentValue());

		EquipmentHealthMonitor.super.displayEquipmentStatus();
	}

}
