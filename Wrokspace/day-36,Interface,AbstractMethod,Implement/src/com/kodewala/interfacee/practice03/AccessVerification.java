package com.kodewala.interfacee.practice03;

public interface AccessVerification {
	
	public static final int MAX_ATTEMPTS = 3;
	
	public abstract boolean verifyAccess(String credential); 
}
