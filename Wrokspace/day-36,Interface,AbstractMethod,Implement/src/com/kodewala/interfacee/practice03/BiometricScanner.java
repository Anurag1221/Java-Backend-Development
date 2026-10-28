package com.kodewala.interfacee.practice03;

public class BiometricScanner implements AccessVerification {

	@Override
	public boolean verifyAccess(String credential) {

		// Check whether the biometric credential is valid
        if (credential.equals("BIO456")) {
            return true;
        } else {
            return false;
        }

	}

}
