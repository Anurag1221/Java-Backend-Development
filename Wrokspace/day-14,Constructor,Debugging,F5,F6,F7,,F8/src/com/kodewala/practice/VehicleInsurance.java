package com.kodewala.practice;

public class VehicleInsurance {
	int policyId;
	String ownerName;
	String vehicleNumber;
	String vehicleType;
	String insuranceType;
	double premium;
	int coverageAmount;
	int policyDuration;

	// 1. No-argument constructor
	VehicleInsurance() {
		this(0, "Unknown");
		System.out.println("Call first constructor");
	}

	// 2. Policy ID + Owner Name
	VehicleInsurance(int _policyId, String _ownerName) {
		this(_policyId, _ownerName, "UNKNOWN");
		System.out.println("Call second constructor");
	}

	// 3. Add Vehicle Number
	VehicleInsurance(int _policyId, String _ownerName, String _vehicleNumber) {
		this(_policyId, _ownerName, _vehicleNumber, "Unknown");
		System.out.println("Call third constructor");
	}

	// 4. Add Vehicle Type
	VehicleInsurance(int _policyId, String _ownerName, String _vehicleNumber, String _vehicleType) {
		this(_policyId, _ownerName, _vehicleNumber, _vehicleType, "Basic");
		System.out.println("Call fourth constructor");
	}

	// 5. Add Insurance Type
	VehicleInsurance(int _policyId, String _ownerName, String _vehicleNumber,
			String _vehicleType, String _insuranceType) {

		this(_policyId, _ownerName, _vehicleNumber, _vehicleType, _insuranceType, 5000);
		System.out.println("Call fifth constructor");
	}

	// 6. Add Premium
	VehicleInsurance(int _policyId, String _ownerName, String _vehicleNumber,
			String _vehicleType, String _insuranceType, double _premium) {

		this(_policyId, _ownerName, _vehicleNumber, _vehicleType, _insuranceType, _premium, 0, 1);
		System.out.println("Call sixth constructor");
	}

	// 7. Final constructor
	VehicleInsurance(int _policyId, String _ownerName, String _vehicleNumber,
			String _vehicleType, String _insuranceType, double _premium, int _coverageAmount, int _policyDuration) {

		policyId = _policyId;
		ownerName = _ownerName;
		vehicleNumber = _vehicleNumber;
		vehicleType = _vehicleType;
		insuranceType = _insuranceType;
		premium = _premium;
		coverageAmount = _coverageAmount;
		policyDuration = _policyDuration;

		System.out.println("Call seventh constructor");
	}
	
	void displayDetails() {

		System.out.println("Policy ID       : " + policyId);
		System.out.println("Owner Name      : " + ownerName);
		System.out.println("Vehicle Number  : " + vehicleNumber);
		System.out.println("Vehicle Type    : " + vehicleType);
		System.out.println("Insurance Type  : " + insuranceType);
		System.out.println("Premium         : " + premium);
		System.out.println("Coverage Amount : " + coverageAmount);
		System.out.println("Policy Duration : " + policyDuration + " years");

		System.out.println();
	}
}
