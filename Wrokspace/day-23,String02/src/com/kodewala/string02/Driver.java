package com.kodewala.string02;

public class Driver {

	public static void main(String[] args) {

		String s1 = "kodewala"; // SCP --> 123njj

		String s2 = new String("Academy"); // one object in scp + one in heap --> 432vcx

		// System.out.println(s1 == s2); // 123njj == 432vcx --> false

		String s3 = new String("kodewala");
		String s4 = new String("kodewalA");

		System.out.println(s4 == s3); // false, s3 and s4 both object store in heap memory but in different address

		System.out.println(s4.equals(s3)); // false, content are different in s3 and s4

	}

}
