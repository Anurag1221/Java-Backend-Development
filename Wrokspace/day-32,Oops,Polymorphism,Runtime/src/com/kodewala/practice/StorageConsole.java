package com.kodewala.practice;
//Runtime Polymorphism
class CloudStorageProcessor {

	public String uploadFile(String fileName) {

		System.out.println("CloudStorageProcessor.uploadFile(fileName) :" + fileName);
		return null;
	}
}

class AmazonS3Processor extends CloudStorageProcessor {
	
	@Override
	public String uploadFile(String fileName) {

		System.out.println("AmazonS3Processor.uploadFile(fileName) :" + fileName);
		return null;
	}
}

class AzureBlobProcessor extends AmazonS3Processor {
	
	@Override
	public String uploadFile(String fileName) {

		System.out.println("AzureBlobProcessor.uploadFile(fileName) :" + fileName);
		return null;
	}
}

public class StorageConsole {

	public static void main(String[] args) {
		
		CloudStorageProcessor processor;

//        // Parent reference points to Amazon S3 object
//        processor = new AmazonS3Processor();
//        processor.uploadFile("report.pdf");

         //Same parent reference points to Azure Blob object
        processor = new AzureBlobProcessor();
        processor.uploadFile("backup.zip");
	}

}


//Q1. Cloud Storage Processing
//Basic
//Classes: CloudStorageProcessor, AmazonS3Processor, AzureBlobProcessor, StorageConsole
//
//A company stores files using different cloud storage providers. Each provider processes file uploads differently.
//
//Requirements
//1. Create uploadFile(String fileName) in the parent class.
//2. Override this method in both child classes.
//3. Create a parent reference pointing to an AmazonS3Processor object.
//4. Call uploadFile() using the parent reference.
//5. Change the reference to an AzureBlobProcessor object and call the method again.
//New concept: Runtime polymorphism — one parent reference can invoke different overridden implementations.
