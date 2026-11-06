package com.kodewala.practice01;

import java.io.Serializable;

public class CloudSession implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String sessionID = "SES101";
	String username = "Anurag";
	String platform = "Web";

	public CloudSession(String sessionID, String username, String platform) {
		super();
		this.sessionID = sessionID;
		this.username = username;
		this.platform = platform;
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

}
