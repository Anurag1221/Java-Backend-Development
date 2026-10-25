package com.kodewala.polymorphism.practice;

public class GoogleCloudStorage extends CloudStorage{
	
	@Override
	public void uploadFile(String fileName) {
		
		System.out.println("GoogleCloudStorage.uploadFile() :" + fileName);
	}
	
}
