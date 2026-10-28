package com.kodewala.interfacee.practice04;

//Estimates time for city deliveries.
public class CityRouteEstimator implements DeliveryEstimator{
	
	@Override
	public int estimateHours(int distanceKm) {
		
		System.out.println("Distance: " + distanceKm);
		System.out.println("For city routes, estimate 1 hour per 15 km: " + distanceKm / 15 + "hours");
		return 0;
	}
}
