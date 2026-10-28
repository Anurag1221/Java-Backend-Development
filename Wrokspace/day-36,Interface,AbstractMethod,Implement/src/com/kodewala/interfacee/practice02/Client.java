package com.kodewala.interfacee.practice02;

public class Client {

	public static void main(String[] args) {
		
		FileUploadService fileUploadService = new FileUploadService();
		
		AzureBlobStorage azureBlobStorage = new AzureBlobStorage();
		fileUploadService.upload(azureBlobStorage, "Hello.txt");
		
		AmazonS3Storage amazonS3Storage = new AmazonS3Storage();
		fileUploadService.upload(amazonS3Storage, "Hi.txt");

	}

}
