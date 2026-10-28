package com.kodewala.interfacee.practice03;

public class AccessCardScanner implements AccessVerification {

	@Override
	public boolean verifyAccess(String credential) {

		// Check whether the card credential is valid
		if (credential.equals("CARD123")) {
			return true;
		} else {
			return false;
		}
	}
}
