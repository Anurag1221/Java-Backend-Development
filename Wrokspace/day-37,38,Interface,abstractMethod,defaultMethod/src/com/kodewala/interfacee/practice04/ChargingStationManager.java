package com.kodewala.interfacee.practice04;

public class ChargingStationManager {

	public static void main(String[] args) {

		ChargingProtocol chargingProtocol = new FastCharger();
		chargingProtocol.startCharging(80);

		int fastTime = chargingProtocol.estimateChargingMinutes(30);

		System.out.println("Estimated charging time: " + fastTime + " minutes");

		chargingProtocol.showChargingGuidelines();

	}
}
