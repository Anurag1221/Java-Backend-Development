package com.kodewala.interfacee.practice04;

public class StandardCharger implements ChargingProtocol {

	@Override
	public void startCharging(int batteryLevel) {

		System.out.println("Standard charging started.");
		System.out.println("Current battery level: " + batteryLevel + "%");
	}

	@Override
	public int estimateChargingMinutes(int batteryLevel) {

		int requiredPercentage = 80 - batteryLevel;

        if (requiredPercentage <= 0) {
            return 0;
        }

        return requiredPercentage * 3;
	}

}
