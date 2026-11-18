package com.kodewala.shallo_deep_copy.practice04;

public class Driver {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		// Creating diagnostic details
		DiagnosticDetails reference = new DiagnosticDetails("Anurag", "Ramtekkar");
		
		 // Creating original medical report
		MedicalReport medicalReport = new MedicalReport("RT101", "Annu", reference);
		
		// Creating shallow copy
		MedicalReport medicalReport1 = (MedicalReport) medicalReport.clone();
		
		// Modifying original test result
		medicalReport.reference.result = "Ram";
		
		
		// Printing original report details
		System.out.println("reportId; " + medicalReport.reportId);
		System.out.println("patientReference; " + medicalReport.patientReference);
		System.out.println("testName; " + medicalReport.reference.testName);
		System.out.println("reportId; " + medicalReport.reference.result);
		
		System.out.println("\n.............................\n");
		
		// Printing cloned report details
		System.out.println("reportId; " + medicalReport1.reportId);
		System.out.println("patientReference; " + medicalReport1.patientReference);
		System.out.println("testName; " + medicalReport1.reference.testName);
		System.out.println("reportId; " + medicalReport1.reference.result);
		
	}
}
