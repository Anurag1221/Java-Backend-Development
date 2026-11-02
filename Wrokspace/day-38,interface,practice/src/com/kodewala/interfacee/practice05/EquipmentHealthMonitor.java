package com.kodewala.interfacee.practice05;

public interface EquipmentHealthMonitor {

	// abstract method
	double readEquipmentValue();

	boolean isWithinSafeRange(double value);

	// default method
	default void displayEquipmentStatus() {

		double value = readEquipmentValue();

		if (isWithinSafeRange(value)) {
			System.out.println("Equipment is operating safely.");
		} else {
			System.out.println("WARNING: Equipment is outside the safe range!");
		}

	}
}
