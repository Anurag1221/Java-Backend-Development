package com.kodewala.polymorphism.practice;

public class AzureBackup extends CloudBackup{
	
	@Override
	public void backupFile(String fileName) {

		System.out.println("AWSBackup.backupFile() :" + fileName);
	}

}
