package com.kodewala.interfacee.practice01;

public interface BackupProvider {

	public abstract void backupFile(String fileName);
	public abstract boolean verifyBackup(String fileName);
	
}	
