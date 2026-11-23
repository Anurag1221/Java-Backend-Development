package com.kodewala.UserDefine.practice02;

public class SimActivationManager {
	
	public void processSim(String simNumber, String kycStatus) {
		
		try {
			simActivation(simNumber, kycStatus);
			
		} catch (KycVerificationPendingException e) {
			
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void simActivation(String simNumber, String kycStatus) {
		
		if(!kycStatus.equals("VERIFIED")) {
			throw new KycVerificationPendingException( "SIM activation failed! KYC verification is pending for SIM: "
	                + simNumber);
		}
		else {
			System.out.println("Sim activation SucessFully");
			System.out.println("SIM Number: " + simNumber);
	        System.out.println("Activation Status: ACTIVE");
		}
	}
}
