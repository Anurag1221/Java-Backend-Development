package com.kodewala.method.overriding;

import com.kodewala.method.overloading.Login;

public class Client {

	public static void main(String[] args) {

		Login login = new Login();

		login.doLogin("ram@gmail.com");

	}

}
