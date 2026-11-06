package com.kodewala.practice06;

import java.io.Serializable;
import java.util.ArrayList;

public class ShipmentRecord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String shipmentID;
	String warehouseName;
	String destinationCity;
	double shipmentWeight;

	public ShipmentRecord(String shipmentID, String warehouseName, String destinationCity, double shipmentWeight) {
		super();
		this.shipmentID = shipmentID;
		this.warehouseName = warehouseName;
		this.destinationCity = destinationCity;
		this.shipmentWeight = shipmentWeight;
	}

	public String getShipmentID() {
		return shipmentID;
	}

	public void setShipmentID(String shipmentID) {
		this.shipmentID = shipmentID;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public double getShipmentWeight() {
		return shipmentWeight;
	}

	public void setShipmentWeight(double shipmentWeight) {
		this.shipmentWeight = shipmentWeight;
	}

}
