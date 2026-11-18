package com.kodewala.execptionHandling.practice;

public class DiagnosticReportProcessor {

	public void processReport(String reportDescription) {
		
		try {
			System.out.println("Blood Test Report" + reportDescription.length());
		}
		catch(NullPointerException e){
			
			System.out.println("Report description is missing, " + e.getMessage());
			e.printStackTrace();
		}
	}
}

//3. Healthcare – Patient Report Processing
//Scenario: A healthcare application receives patient report details. Sometimes the report description is missing.
//
//Classes:
//- DiagnosticReportProcessor
//- Driver
//Requirements:
//1. Declare String reportDescription = null.
//2. Try to calculate its length using length().
//3. Handle NullPointerException.
//4. Print "Report description is missing".
//5. Assign "Blood Test Report" to the description.
//6. Print its length.
//New learning: NullPointerException and null reference handling.
