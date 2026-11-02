package com.kodewala.interfacee.practice05;

public class TaxAssessmentService {
	
	public void taxService(PropertyTaxDiscount taxDiscount, int amount, int rate, int propertyAge) {
		
		taxDiscount.calculateDiscount(amount, rate);
		taxDiscount.calculatePropertyDiscount(propertyAge);
	}
}
