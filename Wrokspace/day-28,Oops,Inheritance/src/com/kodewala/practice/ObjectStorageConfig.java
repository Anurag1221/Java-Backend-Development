package com.kodewala.practice;

class CloudServiceConfig {

	String region;
	String serviceStatus;

	public CloudServiceConfig(String region, String serviceStatus) {
		super();
		this.region = region;
		this.serviceStatus = serviceStatus;
	}

	public void displayConfig() {

		System.out.println(region);
		System.out.println(serviceStatus);
	}

}

public class ObjectStorageConfig extends CloudServiceConfig {

	String bucketName;

	public ObjectStorageConfig(String region, String serviceStatus, String bucketName) {
		super(region, serviceStatus);

		this.bucketName = bucketName;
	}

	public void displayDetails() {

		// parent class
		System.out.println(region);
		System.out.println(serviceStatus);

		// child class
		System.out.println(bucketName);
	}

}


//Q1 · 
//Cloud Infrastructure — Configuration Reuse
//
//Classes: CloudServiceConfig, ObjectStorageConfig, StorageSetupConsole
//A cloud platform stores common configuration details for different services.
//Requirements:
//- Create CloudServiceConfig with region and serviceStatus.
//- Add a method displayConfig().
//- Create ObjectStorageConfig extending CloudServiceConfig.
//- Add bucketName in the child class.
//- Display all three values from the console.
//New concept: Inheriting parent variables and methods.
