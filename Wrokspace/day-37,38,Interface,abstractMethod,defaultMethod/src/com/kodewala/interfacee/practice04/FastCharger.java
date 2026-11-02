package com.kodewala.interfacee.practice04;

public class FastCharger implements ChargingProtocol{
	
	@Override
	public void startCharging(int batteryLevel) {
		
		System.out.println("Fast charging started.");
        System.out.println("Current battery level: " + batteryLevel + "%");
	}
	
	@Override
	public int estimateChargingMinutes(int batteryLevel) {
		
		 int requiredPercentage = 80 - batteryLevel;

	        if (requiredPercentage <= 0) {
	            return 0;
	        }

	        return requiredPercentage * 1;
	}
}
