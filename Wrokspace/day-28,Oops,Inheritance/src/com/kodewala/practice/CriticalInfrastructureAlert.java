package com.kodewala.practice;

class MonitoringAlertBase {

	public MonitoringAlertBase() {
		super();
		System.out.println("Monitoring system initialized");
	}

	public void sendAlert() {
		System.out.println("General alert dispatched");
	}
}

public class CriticalInfrastructureAlert extends MonitoringAlertBase {

	CriticalInfrastructureAlert() {

		System.out.println("Critical monitoring enabled");
	}

	@Override
	public void sendAlert() {
		super.sendAlert();
		System.out.println("Critical alert escalated");
	}
}

//Q7 · Intermediate
//Cloud Monitoring — Alert Escalation
//
//Classes: MonitoringAlertBase, CriticalInfrastructureAlert, AlertDispatchConsole
//A monitoring system sends a general alert first, then applies additional steps for critical infrastructure failures.
//Requirements:
//- Parent constructor prints Monitoring system initialized.
//- Parent method sendAlert() prints General alert dispatched.
//- Child constructor prints Critical monitoring enabled.
//- Override sendAlert() in the child.
//- Call super.sendAlert() inside the overridden method, then print Critical alert escalated.
//- Create one child object and call sendAlert().
//New concepts: Constructor execution order and extending overridden behavior with super.methodName().
//Challenge: Write the exact output in execution order.

