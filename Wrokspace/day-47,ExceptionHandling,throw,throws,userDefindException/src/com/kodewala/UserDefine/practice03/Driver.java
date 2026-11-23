package com.kodewala.UserDefine.practice03;

public class Driver {
	
	public static void main(String[] args) {
		 
		ShipmentDeliveryStatusManager deliveryStatusManager = new ShipmentDeliveryStatusManager();
		deliveryStatusManager.processShipment("SHIP-2026-101", "OUT_FOR_DELIVERY");
	}
}
