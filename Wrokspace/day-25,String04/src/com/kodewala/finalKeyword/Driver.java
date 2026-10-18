package com.kodewala.finalKeyword;
// use final keyword
//use in class,method,variable
//final is against with overriding
//not against overloading

class AccountMgmt { // if class is final, so cannot be parent or extended

	final int UPI_LIMIT = 1000000; // constant variable in java start with Capital letters
									// ones variable is final, can not change the value of variable

	public final void doSomething() { // if method is final,so method cannot be override

		// UPI_LIMIT = 2000000; // varibable is final so can not change the value
	}

	public void doSomething2() {

		// some func..... android
	}
}

class Account extends AccountMgmt {
	
	
	public final void doSomething2() {

	}

	public final void doSomething2(String s) {

	}

	public final void doSomething2(String s, int a) {

	}
}

public class Driver {

	public static void main(String[] args) {

	}

}
