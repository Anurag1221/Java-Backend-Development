package com.kodewala.CustomMarker.practice02;

public class Driver {
	
	public static void main(String args[]) {
		
		MedicalReport medicalReport = new MedicalReport("RE101", "Male", 24);
		medicalReport.displayDetails();
		
		MedicalArchiveManager archiveManager = new MedicalArchiveManager();
		archiveManager.archiveRecord(medicalReport);
	}
}
