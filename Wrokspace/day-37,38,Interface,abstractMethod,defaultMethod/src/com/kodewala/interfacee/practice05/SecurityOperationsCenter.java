package com.kodewala.interfacee.practice05;

public class SecurityOperationsCenter{
	
	public static void main(String[] args) {
		
		LocationRiskAnalyzer analyzer =  new DeviceRiskAnalyzer();
		int str = analyzer.calculateRiskScore("Anu763");
		
		System.out.println("Location Risk Score: " + str);
		
		analyzer.generateRiskReport();
		
	}
}
