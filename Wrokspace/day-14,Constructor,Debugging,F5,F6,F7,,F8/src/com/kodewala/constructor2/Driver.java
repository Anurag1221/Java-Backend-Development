package com.kodewala.constructor2;

class Invoice extends Object {
	static int gst = 18;

	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;

	Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName) {
		this.amount = _amount;
		this.itemName = _itemName;
		this.billingAddress = _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;
	}
}

class Driver {

    public static void main(String[] args) {

        Invoice inv = new Invoice(18000, "Iphone", "Kodewala BTM 2nd stage", "C6367", "kodewala");

        Invoice inv1 = new Invoice(18000, "oppo", "Kodewala BTM 2nd stage", "C7376", "Anurag");

        System.out.println("First invoice : " + inv.amount + " , " + inv.customerId + " , " + Invoice.gst);

        System.out.println("Second invoice : " + inv1.amount + " , " + inv1.customerId + " , " + Invoice.gst);
    }
}
