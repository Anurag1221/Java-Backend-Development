package com.kodewala.interfacee.practice04;

//Interface defines the common delivery estimation rule.
public interface DeliveryEstimator {
	
	public abstract int estimateHours(int distanceKm);
}
