package com.kodewala.practice;

//Method Overloading
public class CloudFileSearchService {

	public void searchFile(String fileName) {

		System.out.println("Searching file by name: " + fileName);
	}

	public void searchFile(int fileId) {

		System.out.println("Searching file by ID: " + fileId);
	}

	public void searchFile(String fileName, String fileType) {

		System.out.println("Searching file: " + fileName + ", File type: " + fileType);
	}
}

//Q1 · Basic · Overloading
//Cloud Storage File Search
//
//Class: CloudFileSearchService
//
//A cloud platform allows users to search for files using different details.
//
//Requirements:
//1. Create searchFile(String fileName).
//2. Overload it with searchFile(int fileId).
//3. Overload it with searchFile(String fileName, String fileType).
//4. Print a different message inside each method.
//5. Call all three methods from main().
//New concept: Same method name with different parameter lists.
