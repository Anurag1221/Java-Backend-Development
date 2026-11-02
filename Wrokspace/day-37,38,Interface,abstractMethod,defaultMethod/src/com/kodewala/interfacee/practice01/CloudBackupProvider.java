package com.kodewala.interfacee.practice01;

public class CloudBackupProvider implements BackupProvider{

	@Override
	public void backupFile(String fileName) {
		
		System.out.println("CloudBackupProvider.backupFile(): " + fileName);
		
	}

	@Override
	public boolean verifyBackup(String fileName) {
		
		System.out.println("CloudBackupProvider.verifyBackup(): " + fileName);
		return false;
	}
	
	
}
