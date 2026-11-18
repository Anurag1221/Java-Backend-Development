package com.kodewala.CustomMarker.practice02;

public class MedicalReport implements Archivable{
	
	String reportId;
	String patientRecordType;
	int retentionYears;
	
	MedicalReport(String reportId, String patientRecordType, int retentionYears){
		
		super();
		this.reportId = reportId;
		this.patientRecordType = patientRecordType;
		this.retentionYears = retentionYears;
	}
	
	public void displayDetails() {
		
		System.out.println("reportId; " + reportId);
		System.out.println("patientRecordType; " + patientRecordType);
		System.out.println("retentionYears; " + retentionYears);
		System.out.println();
	}
}
