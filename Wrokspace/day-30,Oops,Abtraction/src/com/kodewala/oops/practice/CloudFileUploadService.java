package com.kodewala.oops.practice;

public class CloudFileUploadService {

	String fileName = "report.pdf";
	double fileSize = 50;
	double availableStorage = 100;
	boolean uploadStatus = false;

	void validateFile() {

		if (fileName != null && !fileName.isEmpty() && fileSize > 0) {
			System.out.println("File validation successful.");
		} else {
			System.out.println("Invalid file.");
		}
	}

	void checkStorageSpace() {

		if (fileSize <= availableStorage) {
			System.out.println("Storage space is available.");
		} else {
			System.out.println("Not enough storage space.");
		}
	}

	void uploadFile() {

		// Step 1: Validate the file
		if (fileName == null || fileName.isEmpty() || fileSize <= 0) {
			System.out.println("Upload failed: Invalid file.");
			return;
		}

		// Step 2: Check storage
		if (fileSize > availableStorage) {
			System.out.println("Upload failed: Not enough storage.");
			return;
		}

		// Step 3: Upload the file
		uploadStatus = true;
		availableStorage = availableStorage - fileSize;

		System.out.println("File uploaded successfully.");
	}

	void displayUploadStatus() {
		if (uploadStatus) {
			System.out.println("Upload Status: Success");
		} else {
			System.out.println("Upload Status: Failed");
		}
	}

}


//Q5. Cloud File Upload

//Class: CloudFileUploadService
//
//A company uploads files to cloud storage.
//
//Requirements:
//1. Create validateFile().
//2. Create checkStorageSpace().
//3. Create uploadFile().
//4. Create displayUploadStatus().
//5. Make uploadFile() execute the validation and storage checks before uploading.
//New concept: One public method controlling several internal steps.
