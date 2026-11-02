package com.kodewala.marker.practice01;

public class Driver {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		 // Creating original object
		CloudBackupConfiguration backupConfiguration = new CloudBackupConfiguration("Mysql101", "sql101.txt", 30);
		
		//System.out.println(backupConfiguration.retentionDays);
		
		 // Creating management center
        BackupManagementCenter center = new BackupManagementCenter();
        
        // Creating backup copy
        center.createBackupCopy(backupConfiguration);
	}
}
