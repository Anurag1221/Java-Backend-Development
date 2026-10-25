package com.kodewala.polymorphism.practice;

public class StorageManager {

	public void manageStorage(CloudStorage cloudstorage, String fileName) {
		
		cloudstorage.uploadFile(fileName);
	}

}
