package com.kodewala.Oops.Inheritance;

/**
 * 
 * @author ramte
 * @since 1.8
 */
public class DeliveryPartner extends Object{
	
	public void doDelivery() // 500 line of code
	{ 
		System.out.println("DeliveryPartner.doDelivery()");
	}
}

class XpressBee extends DeliveryPartner{
	
	//can reuse here + can override the method of parent class
	@Override
	public void doDelivery() // 1000 line of code
	{ 
		System.out.println("DeliveryPartner.doDelivery()");
		System.out.println("XpressBee.doDelivery()");
	}
}

class Ekart extends DeliveryPartner{
		
	//can reuse here + can override the method of parent class
	@Override
	public void doDelivery() // 1000 line of code
	{ 
		System.out.println("DeliveryPartner.doDelivery()");
		System.out.println("Ekart.doDelivery()");
	}
}