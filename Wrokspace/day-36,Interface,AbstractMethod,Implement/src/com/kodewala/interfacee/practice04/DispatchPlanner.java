package com.kodewala.interfacee.practice04;

//Uses the estimator provided by the caller.
public class DispatchPlanner {
	
	public void planner(DeliveryEstimator deliveryEstimator,int distanceKm) {
		
		deliveryEstimator.estimateHours(distanceKm);
	}
}
