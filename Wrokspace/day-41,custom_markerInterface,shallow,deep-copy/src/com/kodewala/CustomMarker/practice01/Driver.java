package com.kodewala.CustomMarker.practice01;

public class Driver {
	
	public static void main(String[] args) {
		
		CloudFile cloudFile = new CloudFile("Anurag", "shark101.txt");
		
		FileEncryptionEngine encryptionEngine = new FileEncryptionEngine();
		encryptionEngine.encryptFile(cloudFile);
	}
}
