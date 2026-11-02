package com.kodewala.interfacee.practice05;

public class LoginRiskAnalyzer implements LocationRiskAnalyzer{

	@Override
	public int calculateRiskScore(String userId) {
		
		System.out.println("Analyzing login location for: " + userId);

        return 75;
	}

}
