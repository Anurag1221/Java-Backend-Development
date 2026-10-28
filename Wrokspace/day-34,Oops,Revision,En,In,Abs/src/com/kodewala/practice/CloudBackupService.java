
package com.kodewala.practice;

class BackupJob {

    // Store the file name and backup status.  
    private String fileName;
    private String backupStatus;

    // Initialize the backup job.
    public BackupJob(String fileName) {
        this.fileName = fileName;
        this.backupStatus = "Not Started";
    }

    // Provide one simple operation to start a backup.
    public void startBackup() {

        // Reject an empty or blank file name.
        if (fileName == null || fileName.trim().isEmpty()) {
            backupStatus = "Failed";
            System.out.println("Backup failed: File name is empty.");
            return;
        }

        // Perform the internal backup steps.
        if (performBackup()) {
            backupStatus = "Success";
        } else {
            backupStatus = "Failed";
        }

        // Display the final backup result.
        System.out.println("Backup status: " + backupStatus);
    }

    // Hide the internal backup process from calling code.
    private boolean performBackup() {
        System.out.println("Connecting to cloud storage...");
        System.out.println("Uploading file: " + fileName);

        // Simulate a successful upload.
        return true;
    }

    // Provide controlled access to the backup status.
    public String getBackupStatus() {
        return backupStatus;
    }
}

public class CloudBackupService {

    public static void main(String[] args) {

        // Create a backup job for an important file.
        BackupJob job = new BackupJob("CompanyReport.pdf");

        // Start the backup without exposing internal steps.
        job.startBackup();

        // Display the final status.
        System.out.println("Final status: " + job.getBackupStatus());
    }
}

/**Q2. Cloud Backup Platform
Basic · Abstraction
Classes: CloudBackupService, BackupJob

A company backs up important files to cloud storage. Users should start a backup without needing to know every internal step.

Requirements
1. Create a BackupJob class to store the file name and backup status.
2. Keep backup status private.
3. Create a method to start the backup.
4. Validate that the file name is not empty.
5. Display whether the backup succeeded or failed.
6. Keep internal backup details hidden from the calling code.
New learning: Exposing essential operations while hiding implementation details.**/
