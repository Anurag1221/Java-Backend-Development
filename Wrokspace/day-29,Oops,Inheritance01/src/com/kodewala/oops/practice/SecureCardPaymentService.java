package com.kodewala.oops.practice;

// MultiLevel Inheritance -> 1 parent class -> 1 child class -> 1 child class

//parent class 
class PaymentServiceCore {

	String transactionId;

	public PaymentServiceCore(String transactionId) {
		super();
		this.transactionId = transactionId;
	}

	public void validateTransaction() {

		if (transactionId != null) {
			System.out.println("Transaction :" + transactionId);
			System.out.println("Transaction validated");
		} else {
			System.out.println("Not Transaction validated");
		}
	}
}

//child class 
class CardPaymentService extends PaymentServiceCore {

	String cardNetwork;

	public CardPaymentService(String transactionId, String cardNetwork) {
		super(transactionId);
		this.cardNetwork = cardNetwork;
	}

	public void processCardPayment() {

		System.out.println("Card Network: " + cardNetwork);
        System.out.println("Card payment processed");
	}

}


//child class
public class SecureCardPaymentService extends CardPaymentService {
	
	boolean securityTokenVerified;

	public SecureCardPaymentService(String transactionId, String cardNetwork, boolean securityTokenVerified) {
		super(transactionId, cardNetwork);
		this.securityTokenVerified = securityTokenVerified;
	}
	
	public void verifySecurityToken() {
		
		if (securityTokenVerified) {
            System.out.println("Security token verified");
        } else {
            System.out.println("Security token verification failed");
        }
	}
}

//Q2 · Basic

//Multilevel inheritance
//
//Payment Gateway — Transaction Processing
//Classes: PaymentServiceCore, CardPaymentService, SecureCardPaymentService, PaymentExecutionConsole
//A payment platform has common transaction details, card-specific processing, and an additional security verification step.
//Requirements
//1. PaymentServiceCore stores transactionId and has validateTransaction().
//2. CardPaymentService extends the parent and adds cardNetwork.
//3. Override or add processCardPayment() in the card service.
//4. SecureCardPaymentService extends CardPaymentService.
//5. Add securityTokenVerified to the final child class.
//6. Display inherited data and execute all three processing steps in order.
//Expected output
//Transaction: TXN2045
//Transaction validated
//Card Network: VISA
//Card payment processed
//Security token verified
//
//
//New concept: Inheriting through three levels and reusing methods from a grandparent.
