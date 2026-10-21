package com.kodewala.practice;
//Method overRiding
class MonitoringAlertService {

	public void generateAlert() {

		System.out.println("MonitoringAlertService.generateAlert()");
	}

}

public class DatabaseMonitoringAlert extends MonitoringAlertService {

	@Override
	public void generateAlert() {

		//System.out.println("MonitoringAlertService.generateAlert()");
		System.out.println("DatabaseMonitoringAlert.generateAlert()");
	}
}
