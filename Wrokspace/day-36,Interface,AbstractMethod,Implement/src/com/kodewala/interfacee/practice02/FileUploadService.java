package com.kodewala.interfacee.practice02;

public class FileUploadService {

	public void upload(CloudStorage cloudStorage, String fileName) {
		
		cloudStorage.uploadFile(fileName);
	}

}
