package com.kodewala.practice.whileloop;

import java.util.Scanner;

public class WarehouseBarcodeScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(count < 10) {
			
			System.out.println("Pls enter Barcode");
			int barCode = sc.nextInt();
			
			if(barCode == 0) {
				
				System.out.println("Scanning session is finished");
				break;
			} 
			else if(barCode < 0) {
				
				System.out.println("Invalid barcode");
				continue;
			}
			else {
				
				System.out.println("Barcode scanned successfully");
				System.err.println();
				//System.out.println("Pls enter Barcode");
				count++;
			}
			
		}
		
		if(count == 10) {
			
			System.out.println("Batch scanning completed");
		}
		sc.close();
	}

}

//3. Warehouse Barcode Scanner
//
//Create a class WarehouseBarcodeScanner.
//
//A warehouse operator scans product barcodes one by one.
//
//Requirements:
//Use Scanner.
//Use a while loop.
//Ask the operator to enter a barcode.
//Barcode 0 means the scanning session is finished.
//If the barcode is negative, print "Invalid barcode" and use continue.
//For every valid barcode, print:
//"Barcode scanned successfully"
//Count the number of valid barcodes.
//After 10 valid scans, print "Batch scanning completed" and use break.
//
//Example:
//
//Enter barcode: 458921
//Barcode scanned successfully
//
//Enter barcode: -45
//Invalid barcode
//
//Enter barcode: 782341
//Barcode scanned successfully
//
//Concepts: while, Scanner, continue, break
