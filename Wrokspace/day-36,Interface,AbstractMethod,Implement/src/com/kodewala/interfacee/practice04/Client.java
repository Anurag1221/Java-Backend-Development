package com.kodewala.interfacee.practice04;

//Main class to test both implementations.
public class Client {

	public static void main(String[] args) {
		
		DispatchPlanner dispatchPlanner = new DispatchPlanner();
		
		IntercityRouteEstimator estimator = new IntercityRouteEstimator();
		dispatchPlanner.planner(estimator, 60);
		
		System.out.println();
		
		CityRouteEstimator cityRouteEstimator = new CityRouteEstimator();
		dispatchPlanner.planner(cityRouteEstimator, 60);

	}

}
