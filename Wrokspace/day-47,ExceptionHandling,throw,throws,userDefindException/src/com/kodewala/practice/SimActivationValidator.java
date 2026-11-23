package com.kodewala.practice;

public class SimActivationValidator {
	
	public void validateSimNumber(String simNumber) {
			
		try {
			checkSimNumber(simNumber);
			System.out.println("SIM Activated Successfully");
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
	}
	
	public void checkSimNumber(String simNumber) throws IllegalArgumentException{
		
		
			if (simNumber == null || !simNumber.matches("[0-9]{10}")) {
				
				throw new IllegalArgumentException("SIM Activation Failed");
			}
			
			//System.out.println("SIM validation successful");
	}
}
