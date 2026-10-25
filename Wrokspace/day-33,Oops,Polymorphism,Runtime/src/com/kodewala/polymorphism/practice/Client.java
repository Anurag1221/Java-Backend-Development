package com.kodewala.polymorphism.practice;

public class Client {

	public static void main(String[] args) {
		
		StorageManager manager = new StorageManager();
		
		//Parent class(CloudStorage) reference pointing to child(AmazonStorage)
		AmazonStorage amazonStorage = new AmazonStorage();
		manager.manageStorage(amazonStorage, "report.pdf");
		
		//Parent class(CloudStorage) reference pointing to child(GoogleCloudStorage)
		GoogleCloudStorage googlecloudstorage = new GoogleCloudStorage();
		manager.manageStorage(googlecloudstorage, "report.pdf");

	}

}
