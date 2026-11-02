package com.kodewala.interfacee.practice05;

public interface LocationRiskAnalyzer {
	
	public abstract int calculateRiskScore(String userId);
	
	
	default void generateRiskReport(){
		
		System.out.println("General Login Risk Report Generated.");
		
	}
}
