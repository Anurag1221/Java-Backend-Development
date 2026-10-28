package com.kodewala.interfacee.practice03;

public class Client {

	public static void main(String[] args) {
		
		// Create the entry gate
        EntryGate gate = new EntryGate();
        
     // Create the access card scanner
        AccessVerification card = new AccessCardScanner();
     // Verify access using a valid card
        gate.verify(card, "CARD123");
        
     // Create the biometric scanner
        AccessVerification biometric = new BiometricScanner();

        // Verify access using an invalid biometric credential
        gate.verify(biometric, "WRONG123");
        
        System.out.println("Maximum Attempts: " + AccessVerification.MAX_ATTEMPTS);
	}
 
}
