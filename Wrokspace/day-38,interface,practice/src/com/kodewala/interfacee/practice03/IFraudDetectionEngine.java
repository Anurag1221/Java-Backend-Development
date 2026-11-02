package com.kodewala.interfacee.practice03;

public interface IFraudDetectionEngine {
	
	public abstract boolean detectSuspiciousTransaction();
	public abstract int getRiskScore();
}
