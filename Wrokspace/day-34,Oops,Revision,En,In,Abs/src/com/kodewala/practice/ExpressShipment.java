package com.kodewala.practice;

class Shipment {

	private String trackingId;
	private String destination;

	public Shipment(String trackingID, String destination) {
		super();
		this.trackingId = trackingID;
		this.destination = destination;
	}
	
	public String getTrackingId() {
        return trackingId;
    }
	
	// Return the destination.
    public String getDestination() {
        return destination;
    }

    public void displayShipmentDetails() {
        System.out.println("Tracking ID: " + trackingId);
        System.out.println("Destination: " + destination);
    }

}

class ExpressShipment extends Shipment {

	// Store the maximum allowed temperature.
    private double temperatureLimit;

    
    
	public ExpressShipment(String trackingID, String destination, double temperatureLimit) {
		super(trackingID, destination);
		this.temperatureLimit = temperatureLimit;
	}

	 // Display refrigerated shipment information.
    public void displayDetails() {
        displayShipmentDetails();
        System.out.println("Temperature Limit: "
                           + temperatureLimit + " C");
    }
}

class RefrigeratedShipment  extends Shipment {

	 // Store the delivery priority.
    private String deliveryPriority;
    
    
	public RefrigeratedShipment(String trackingID, String destination, String deliveryPriority) {
		super(trackingID, destination);
		this.deliveryPriority = deliveryPriority;
	}
	
	 // Display express shipment information.
    public void displayDetails() {
        displayShipmentDetails();
        System.out.println("Delivery Priority: " + deliveryPriority);
    }
}

