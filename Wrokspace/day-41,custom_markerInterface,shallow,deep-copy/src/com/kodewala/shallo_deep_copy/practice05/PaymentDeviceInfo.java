package com.kodewala.shallo_deep_copy.practice05;

public class PaymentDeviceInfo implements Cloneable{

	String deviceId;
	String ipAddress;

	public PaymentDeviceInfo(String deviceId, String ipAddress) {
		super();
		this.deviceId = deviceId;
		this.ipAddress = ipAddress;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}
