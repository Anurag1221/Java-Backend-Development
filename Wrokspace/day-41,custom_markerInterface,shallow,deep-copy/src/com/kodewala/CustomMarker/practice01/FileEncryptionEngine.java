package com.kodewala.CustomMarker.practice01;

public class FileEncryptionEngine {
	
	public void encryptFile(Object obj) {
		
		if(obj instanceof Encryptable) {
			
			System.out.println("File encryption started successfully");
		}
		else {
			System.out.println("File is not eligible for encryption");
		}
	}
}
