package com.kodewala.practice;

public class CloudFileUpload {
	String fileName;
	long fileSize;
	String storagePath;
	
	CloudFileUpload(){
		this("Unknown.txt");
	}
	
	CloudFileUpload(String _fileName){
		this(_fileName, 0);
	}
	
	CloudFileUpload(String _fileName, long _fileSize){
		this(_fileName, _fileSize, "Unknown");
	}
	
	CloudFileUpload(String _fileName, long _fileSize, String _storagePath){
		fileName = _fileName;
		fileSize = _fileSize;
		storagePath = _storagePath;
	}
	
	void displayDetails() {
		System.out.println("fileName :" + fileName);
		System.out.println("fileSize :" + fileSize);
		System.out.println("storagePath :" + storagePath);
	}
	

}

//2. CloudFileUpload
//
//Create a class CloudFileUpload.
//
//Store:
//
//fileName
//fileSize
//storagePath
//
//Create multiple constructors:
//
//CloudFileUpload()
//CloudFileUpload(String fileName)
//CloudFileUpload(String fileName, long fileSize)
//CloudFileUpload(String fileName, long fileSize, String storagePath)
//
//Requirements:
//
//Use this() for constructor chaining.
//The first constructor should assign default values.
//Each constructor should reuse the next constructor instead of repeating initialization code.
//Add a method to display upload information.
//
//Concept focus: Constructor overloading + this().
