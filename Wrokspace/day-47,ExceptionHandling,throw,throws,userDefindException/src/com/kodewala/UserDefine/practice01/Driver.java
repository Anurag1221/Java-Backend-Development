package com.kodewala.UserDefine.practice01;

public class Driver {
	
	public static void main(String[] args) {
		
		CloudStorageUploadManager cloudStorageUploadManager = new CloudStorageUploadManager();
		cloudStorageUploadManager.processStorage(100, 85, 20);
	}
}
