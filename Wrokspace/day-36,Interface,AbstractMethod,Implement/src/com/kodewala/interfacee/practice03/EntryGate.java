package com.kodewala.interfacee.practice03;

public class EntryGate {

	public void verify(AccessVerification accessVerification, String credential) {

		 boolean result = accessVerification.verifyAccess(credential);

		// Grant or deny entry based on the result
		if (result) {
			System.out.println("Entry Granted");
		} else {
			System.out.println("Entry Denied");
		}
	}
}
