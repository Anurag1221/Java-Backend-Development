package com.kodewla.control.flow;

public class TripPlannerDriver {

	public static void main(String[] args) {
		TripPlanner trip = new TripPlanner();
		
		String response = trip.suggestPlan("BGL", "Bhopal", 10000);
		
		System.out.println(response);

	}

}
