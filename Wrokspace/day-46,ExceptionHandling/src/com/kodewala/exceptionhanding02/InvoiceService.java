package com.kodewala.exceptionhanding02;

public class InvoiceService {
	
	public void generateInvoice() {
		
		// Get customer and order details from database
		// [Connect with database --> create db connection] +
		// [get details from db]
		
		try {
			//connectDatabase(); //creating connection
			String name = "bhx";
			name.lastIndexOf("a");
			System.out.println("Generating an invoice...");
		}
		catch (Exception e) {
			System.out.println(" some exception");
			e.printStackTrace();
		}
		finally {
			//mandatory executable block (Exception OR No Exception)
			System.out.println("I am inside finally block...");
		}
	}
}
