package com.kodewala.UserDefine.practice03;

public class ShipmentDeliveryStatusManager {

	public void processShipment(String shipmentId, String shipmentStatus) {

		try {
			markShipmentDelivered(shipmentId, shipmentStatus);
		} catch (InvalidShipmentStatusException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void markShipmentDelivered(String shipmentId, String shipmentStatus) {

		if (!shipmentStatus.equals("OUT_FOR_DELIVERY")) {
			throw new InvalidShipmentStatusException("Delivery failed! Shipment ID: " + shipmentId
					+ " cannot be marked as delivered because its current status is " + shipmentStatus);
		} else {
			System.out.println("Shipment delivered successfully!");
			System.out.println("Shipment ID: " + shipmentId);
			System.out.println("Shipment Status: DELIVERED");
		}
	}
}
