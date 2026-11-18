package com.kodewala.practice02;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		 // Creating DeliveryOrder object
        DeliveryOrder order = new DeliveryOrder();
        
		//serialization
		OrderBackupService backupService = new OrderBackupService();
		//DeliveryOrder deliveryOrder = null;
		backupService.processDelivery(order);
		
		//de-serialization
		OrderRecoveryService orderRecoveryService = new OrderRecoveryService();
		orderRecoveryService.readDelivery();
	}

}
