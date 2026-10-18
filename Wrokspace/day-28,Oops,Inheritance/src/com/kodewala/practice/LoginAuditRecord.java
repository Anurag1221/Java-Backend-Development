package com.kodewala.practice;

class SecurityAuditBase {// parent class

	int loginId;

	public SecurityAuditBase(int loginId) {
		super();
		this.loginId = loginId;
	}

	public void displayID() {

		System.out.println("Display ID :" +loginId);
	}
}

//LoginAuditRecord --> child class
public class LoginAuditRecord extends SecurityAuditBase {

	int failedAttempts;

	public LoginAuditRecord(int loginId, int failedAttempts) {
		super(loginId);

		this.failedAttempts = failedAttempts;
	}

	public void checkInvestigationStatus() {
        
		if (failedAttempts >= 5) {
            System.out.println("Account needs investigation.");
        } else {
            System.out.println("No investigation required.");
        }
    }

}

//Q2 · Basic
//Cybersecurity — Access Verification
//
//Classes: SecurityAuditBase, LoginAuditRecord, AuditReportConsole
//A security platform records login attempts and their verification status.
//Requirements:
//- Parent class stores loginId.
//- Parent method displays the login ID.
//- Child class stores failedAttempts.
//- Child method displays whether the account needs investigation.
//- Create an object of LoginAuditRecord and call both methods.
//New concept: Using inherited behavior alongside child-specific behavior.
