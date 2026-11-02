package com.kodewala.interfacee.practice05;

public class DeviceRiskAnalyzer implements LocationRiskAnalyzer{
	
	@Override
	public int calculateRiskScore(String userId) {
		
		 System.out.println("Analyzing device information for: " + userId);

	        return 40;
	}
	
	@Override
	public void generateRiskReport() {

		System.out.println("Device-specific Security Risk Report Generated.");
	}

}
