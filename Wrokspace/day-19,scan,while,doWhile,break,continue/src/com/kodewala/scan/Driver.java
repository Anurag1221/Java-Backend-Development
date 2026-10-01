package com.kodewala.scan;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // creates connection with console

		System.out.println("Please enter your name");
		String name = sc.nextLine(); // reading String input

		System.out.println("Please enter product price");
		int price = sc.nextInt();// reading int --> this will leave new line char \n
		sc.nextLine(); // consume extra space

		System.out.println("Pls enter delivery address...");
		String address = sc.nextLine(); // reading String input

		System.out.println("Name is :" + name);
		System.out.println("Product price is :" + price);
		System.out.println("Address is :" + address);

		sc.close();
	}

}
