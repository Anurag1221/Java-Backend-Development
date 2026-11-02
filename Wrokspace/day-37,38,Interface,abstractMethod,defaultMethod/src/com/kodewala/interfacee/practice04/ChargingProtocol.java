package com.kodewala.interfacee.practice04;

public interface ChargingProtocol {

	public abstract void startCharging(int batteryLevel);

	public abstract int estimateChargingMinutes(int batteryLevel);

	default void showChargingGuidelines() {

		System.out.println("Charging Safety Guidelines:");
		System.out.println("1. Use a certified charging cable.");
		System.out.println("2. Avoid charging near water.");
		System.out.println("3. Do not use a damaged charger.");
		System.out.println("4. Disconnect after charging.");
	}
}
