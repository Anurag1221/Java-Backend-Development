package com.kodewala.constructor;

public class ProductDriver {

	public static void main(String[] args) {
		ElectronicProduct pro = new ElectronicProduct("Oppo", 15000, "OP101", 2);

		System.out.println(pro.name);
		System.out.println(pro.price);
		System.out.println(pro.productId);
		System.out.println(pro.warranty);
	}

}
