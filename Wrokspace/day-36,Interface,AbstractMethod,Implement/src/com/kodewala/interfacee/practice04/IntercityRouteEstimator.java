package com.kodewala.interfacee.practice04;

//Estimates time for intercity deliveries.
public class IntercityRouteEstimator implements DeliveryEstimator{
	
	@Override
	public int estimateHours(int distanceKm) {
		
		System.out.println("Distance: " + distanceKm);
		System.out.println("For intercity routes, estimate 1 hour per 60 km: " + distanceKm / 60 + "hours");
		return 0;
	}
	
}
