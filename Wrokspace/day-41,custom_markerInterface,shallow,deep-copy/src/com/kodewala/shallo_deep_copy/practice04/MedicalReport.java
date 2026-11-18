package com.kodewala.shallo_deep_copy.practice04;

public class MedicalReport implements Cloneable{

	String reportId;
	String patientReference;
	DiagnosticDetails reference;

	public MedicalReport(String reportId, String patientReference, DiagnosticDetails reference) {
		super();
		this.reportId = reportId;
		this.patientReference = patientReference;
		this.reference = reference;
	}
	
	//shallow copy
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	//display details
//	public void displayDetailsMedicalReport() {
//		
//		System.out.println("reportId;" + reportId);
//		System.out.println("patientReference;" + patientReference);
//	
//	}

}
