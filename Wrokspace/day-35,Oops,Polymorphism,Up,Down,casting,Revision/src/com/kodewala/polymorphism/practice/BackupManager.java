package com.kodewala.polymorphism.practice;

public class BackupManager {
	
	public static void main(String[] args) {
		
		CloudProcessor cloudProcessor = new CloudProcessor();
		
		AzureBackup azureBackup = new AzureBackup();
		cloudProcessor.processCloud(azureBackup, "XGVGZ536.txt");
		
	}
}
