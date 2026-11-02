package com.kodewala.interfacee.practice01;

public class BackupScheduler {
	
	public static void main(String[] args) {
		
		BackupProvider backupProvider = new LocalBackupProvider();
		backupProvider.backupFile("gcvg5376.xtx");
		backupProvider.verifyBackup("vhvs736.txt");
		
		
	}

}
