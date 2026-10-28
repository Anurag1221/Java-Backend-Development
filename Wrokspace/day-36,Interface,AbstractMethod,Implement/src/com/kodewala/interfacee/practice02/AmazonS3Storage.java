package com.kodewala.interfacee.practice02;

//Implement CloudStorage for Amazon S3
public class AmazonS3Storage implements CloudStorage {

	@Override
	public void uploadFile(String fileName) {

		System.out.println("AmazonS3Storage.uploadFile() :" + fileName);
	}

}
