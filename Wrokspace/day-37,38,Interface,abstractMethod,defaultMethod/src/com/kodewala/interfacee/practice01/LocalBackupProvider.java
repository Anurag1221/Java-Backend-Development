package com.kodewala.interfacee.practice01;

public class LocalBackupProvider implements BackupProvider{

	@Override
	public void backupFile(String fileName) {
		
		System.out.println("LocalBackupProvider.backupFile(): " + fileName);
		
	}

	@Override
	public boolean verifyBackup(String fileName) {
		
		System.out.println("LocalBackupProvider.verifyBackup(): " + fileName);
		return true;
	}

}
