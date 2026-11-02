package com.kodewala.interfacee.practice05;

public class Client {

	public static void main(String[] args) {

		TaxAssessmentService service = new TaxAssessmentService();

		ResidentialTaxRelief residential = new ResidentialTaxRelief();
		service.taxService(residential, 2000, 10, 20);

	}

}
