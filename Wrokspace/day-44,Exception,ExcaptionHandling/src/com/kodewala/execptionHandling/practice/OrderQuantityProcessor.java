package com.kodewala.execptionHandling.practice;

public class OrderQuantityProcessor {

	public void processQuantity(String quantity) {

		try {
			int orderQuantity = Integer.parseInt(quantity);
			System.out.println("Order Quantity: " + orderQuantity);
		}
		catch (NumberFormatException e) {

			System.out.println("Invalid quantity entered!");
			System.out.println("Error: " + e.getMessage()); //getMessage->	Prints only error message
			e.printStackTrace(); // printStackTrace() is used to print complete exception details
								//including the exception name, error message, and the line number where the exception occurred.
		}

	}

}

//1. E-commerce – Order Quantity Validation
//Scenario: An e-commerce application receives order quantities from customers. Sometimes customers enter invalid values.
//
//Classes:
//- OrderQuantityProcessor
//- Driver
//Requirements:
//1. Create OrderQuantityProcessor.
//2. Declare String quantity.
//3. Assign "25" to quantity.
//4. Convert String into an integer using Integer.parseInt().
//5. Handle NumberFormatException using try-catch.
//6. Print the converted quantity.
//7. Test with "twenty" instead of "25".
//New learning: NumberFormatException
