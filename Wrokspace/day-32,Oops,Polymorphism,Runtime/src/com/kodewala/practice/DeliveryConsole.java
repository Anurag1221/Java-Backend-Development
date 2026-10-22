package com.kodewala.practice;

class DeliveryCostEstimator {

	public double estimateCost(double weight) {

		return 0;
	}
}

class SameDayDeliveryEstimator extends DeliveryCostEstimator {

	@Override
	public double estimateCost(double weight) {
		return weight * 50.0 + 100.0;
	}
}

class InternationalDeliveryEstimator extends SameDayDeliveryEstimator {

	@Override
	public double estimateCost(double weight) {
		return weight * 200.0 + 500.0;
	}
}

public class DeliveryConsole {

	public static void main(String[] args) {

		DeliveryCostEstimator estimator;

		// Same-day delivery
//		estimator = new SameDayDeliveryEstimator();
//		double sameDayCost = estimator.estimateCost(5.0);
//
//		System.out.println("Same-day delivery cost: Rs. " + sameDayCost);

		// International delivery
		estimator = new InternationalDeliveryEstimator();
		double internationalCost = estimator.estimateCost(5.0);

		System.out.println("International delivery cost: Rs. " + internationalCost);

	}

}

//Q4. Delivery Cost Estimation
//Basic
//Classes: DeliveryCostEstimator, SameDayDeliveryEstimator, InternationalDeliveryEstimator, DeliveryConsole
//
//A logistics platform estimates delivery costs differently for same-day and international shipments.
//
//Requirements
//1. Create estimateCost(double weight) in the parent class.
//2. Override the method in both child classes.
//3. Create a parent reference pointing to each child object.
//4. Estimate the cost for a shipment weighing 5.0 kg.
//5. Print the result from each implementation.
//New concept: Runtime polymorphism with return values and method parameters.
