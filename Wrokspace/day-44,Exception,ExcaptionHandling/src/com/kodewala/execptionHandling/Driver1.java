package com.kodewala.execptionHandling;

public class Driver1 {

	public static void main(String[] args) {

		System.out.println("Driver1.main() START");

		Driver1 driver1 = new Driver1();
		driver1.doSomeThing();

		System.out.println("Driver1.main() END");
	}

	public void doSomeThing() {

		System.out.println("Driver1.doSomeThing() START");

		String name = null;
		int amount = 100;

		try {
			// Risky code --> code which may throw an exception.
			amount = amount / 0;
			System.out.println(name.length()); // NPE -> not handled
			System.out.println(" After length()"); // ignore this line
		}
		catch (NullPointerException e) { // This can catch Exception's object and its child objects

			System.out.println("name is Null");
			e.printStackTrace();
		} 
		catch (ArithmeticException e) { // This can catch Exception's object and its child objects

			System.out.println("Amount can not be / by zero");
			e.printStackTrace();
		}

		System.out.println("Driver1.doSomeThing() END");
	}
}
