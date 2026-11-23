package com.kodewala.exceptionhanding02.practice;

public class ShipmentTrackingStatusProcessor {
	
	public void processShopment() {
		
		String[] shipmentStatuses = {"PICKED_UP", "IN_TRANSIT", "OUT_FOR_DELIVERY"};
		int currentStatusIndex = 2;
		String shipmentId = "SHIP-9081";
		String deliveryHub = null;
		
		try {
			System.out.println("shipment Id: " +shipmentId);
			System.out.println("shipment Statuses: " + shipmentStatuses[5]);
			System.out.println("deliveryHub: " +deliveryHub.length());
			System.out.println("Shipment tracking updated successfully");
			
		} 
		catch (Exception e) {
			System.out.println("Shipment tracking update failed");
			e.printStackTrace();
		}
		finally {
			System.out.println("Shipment tracking process completed");
		}
	}
}

//6. Logistics Technology – Shipment Tracking Status Processor
//Intermediate 2
//Scenario: A logistics platform processes shipment tracking information received from multiple delivery hubs. Sometimes, tracking information is incomplete or contains invalid shipment data.
//
//Classes:
//- ShipmentTrackingStatusProcessor
//- DeliveryExceptionAuditLogger
//- Driver
//Requirements:
//1. Declare String[] shipmentStatuses = {"PICKED_UP", "IN_TRANSIT", "OUT_FOR_DELIVERY"}.
//2. Declare int currentStatusIndex = 2.
//3. Declare String shipmentId = "SHIP-9081".
//4. Declare String deliveryHub = null.
//5. Inside try:
//   - Print shipment ID.
//   - Access shipmentStatuses[currentStatusIndex].
//   - Print the current shipment status.
//   - Access deliveryHub.length().
//   - Print "Shipment tracking updated successfully".
//6. Catch the exception and print "Shipment tracking update failed".
//7. Inside finally, print "Shipment tracking process completed".
//8. Create an object and call the method from Driver.
//New learning:
//- Multiple risky statements inside try.
//- Exception occurs in the middle of execution.
//- Statements after an exception are skipped.
//- Finally executes even after an exception.
