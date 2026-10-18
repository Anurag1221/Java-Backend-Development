package com.kodewala.oops.inheritance01;

public class ElectronicsProduct extends Product {
	
	boolean isWarranty;
	int warrantyInYears;
	
	
	public ElectronicsProduct(String productName, String description, int quantity, String status, boolean isWarranty,
			int warrantyInYears) {
		
		super(productName, description, quantity, status);
		
		this.isWarranty = isWarranty;
		this.warrantyInYears = warrantyInYears;
	}
	
	public void viewElectronicProductDetails() {
		
		//product class
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		
		//Electronics class
		System.out.println(isWarranty);
		System.out.println(warrantyInYears);
	}
	
	
}
