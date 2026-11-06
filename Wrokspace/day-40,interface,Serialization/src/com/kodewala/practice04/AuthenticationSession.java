package com.kodewala.practice04;

import java.io.Serializable;

public class AuthenticationSession implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //transient is a Java keyword used to prevent a variable from being serialized.
	String sessionID = "AUTH501";
	String username = "Anurag";
	transient String authenticationToken = "TOKEN@123";
	String loginDevice = "Windows";
}
