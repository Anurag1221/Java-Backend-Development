package com.kodewala.oops.practice;

//single inheritance
// 1 parent class and 1 child class ,child extends the parent class
class CloudStorageBase {//parent class

	String region;
	String serviceStatus;
	
	public CloudStorageBase(String region, String serviceStatus) {
		super();
		this.region = region;
		this.serviceStatus = serviceStatus;
	}
	
	
}

// child class
public class ObjectStorageConfig  extends CloudStorageBase{
	
	String bucketName;

	public ObjectStorageConfig(String region, String serviceStatus, String bucketName) {
		super(region, serviceStatus);
		this.bucketName = bucketName;
	}
	
	void displayDetails() {
		
		System.out.println("Region :" + region);
		System.out.println("serviceStatus :" + serviceStatus);
		System.out.println("bucketName :" + bucketName);
	}
	
}

//Q1 · Basic

//Single inheritance
//
//Cloud Storage — Access Configuration
//Classes: CloudStorageBase, ObjectStorageConfig, StorageConfigConsole
//A cloud platform stores files in different regions. Every storage service has a region and service status, while object storage also has a bucket name.
//Requirements
//1. Create CloudStorageBase with region and serviceStatus.
//2. Create a constructor to initialize both fields.
//3. Create ObjectStorageConfig that extends the parent class.
//4. Add a bucketName field to the child class.
//5. Use super() to initialize parent fields.
//6. Display all three values.
//Expected output
//Region: ap-south-1
//Service Status: ACTIVE
//Bucket Name: customer-documents
//
//
//New concept: Reusing parent fields and initializing them with super().
