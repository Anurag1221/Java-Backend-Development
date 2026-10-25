package com.kodewala.polymorphism.runtime.task;

public class Client {

	public static void main(String[] args) {

		OrderPsocessor orderPsocessor = new OrderPsocessor();

		// Calli EcommerceOrder
		EcommerceOrder ecommerceOrder = new EcommerceOrder();
		orderPsocessor.processOrder(ecommerceOrder);

		// Calli OfflineOrder
		OfflineOrder offlineorder = new OfflineOrder();
		orderPsocessor.processOrder(offlineorder);

		// Calli RetailOrder
		RetailOrder retailorder = new RetailOrder();
		orderPsocessor.processOrder(retailorder);
 	}

}
