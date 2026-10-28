package com.kodewala.interfacee.practice02;

//Implement CloudStorage for Azure Blob Storage
public class AzureBlobStorage implements CloudStorage{
	
	@Override
	public void uploadFile(String fileName) {
		
		System.out.println("AzureBlobStorage.uploadFile() :" + fileName);
	}
}
