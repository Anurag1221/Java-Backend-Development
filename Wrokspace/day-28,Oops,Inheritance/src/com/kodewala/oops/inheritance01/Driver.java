package com.kodewala.oops.inheritance01;

public class Driver {

	public static void main(String[] args) {
		
		//product class --> parent class 
//		Product item = new Product("Apple", "Iphone 18 pro", 1,"Book");
		
//		item.viewProductDetails();
//		
//		//Electronics --> child class
//		ElectronicsProduct product = new ElectronicsProduct("Apple", "Iphone 18 pro", 1, "Book", false, 0);
//		
//		product.viewElectronicProductDetails();
		
		//Clothing --> child class
		Clothing cloths = new Clothing("T-Shirt", "T-Shirt xyz", 1, "Buy", "M", "599");
		
		cloths.viewClothingProduct();

	}

}
