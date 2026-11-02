package com.kodewala.marker.practice03;

public class InsurancePolicyRecord implements Cloneable,SensitiveDocument{
	
	String policyNumber;
	String customerName;
	double premiumAmount;
	int policyDuration;
	
	public InsurancePolicyRecord(String policyNumber, String customerName, double premiumAmount, int policyDuration) {
		super();
		this.policyNumber = policyNumber;
		this.customerName = customerName;
		this.premiumAmount = premiumAmount;
		this.policyDuration = policyDuration;
	}
	
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	public void displayDetails() {
		
		System.out.println("policyNumber: " +policyNumber);
		System.out.println("customerName: " +customerName);
		System.out.println("premiumAmount: " +premiumAmount);
		System.out.println("policyDuration: " +policyDuration);
	}
	
}
