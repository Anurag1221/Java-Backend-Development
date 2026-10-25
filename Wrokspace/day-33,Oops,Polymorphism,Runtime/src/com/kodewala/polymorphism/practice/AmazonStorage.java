package com.kodewala.polymorphism.practice;

public class AmazonStorage extends CloudStorage{
	
	@Override
	public void uploadFile(String fileName) {
		
		System.out.println("AmazonStorage.uploadFile() :" + fileName);
	}	
}
