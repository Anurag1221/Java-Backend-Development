package com.kodewala.practice;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Start");
		
		//1 problem
//		PaymentGatewayConfig pg = new PaymentGatewayConfig("Anurag");
//		PaymentGatewayConfig pg1 = new PaymentGatewayConfig("Anurag");
		
		//2 problem
//		CloudStorageSession session = new CloudStorageSession("SN101");
//		CloudStorageSession session1 = new CloudStorageSession("SN102");
//		CloudStorageSession session2 = new CloudStorageSession("SN103");
		
		//3 problem
//		LogMonitoringService log = new LogMonitoringService();
//		LogMonitoringService log1 = new LogMonitoringService();
//		LogMonitoringService log2 = new LogMonitoringService();
		
		//4 problem
//		OTPVerificationSession otp = new OTPVerificationSession(355456376);
//		OTPVerificationSession otp1 = new OTPVerificationSession("anurag@gmail.com");
		
		//5 problem
//		InventoryCacheManager cache = new InventoryCacheManager();
//		InventoryCacheManager cache1 = new InventoryCacheManager();
//		InventoryCacheManager cache2 = new InventoryCacheManager();
//		
//		InventoryCacheManager cache3 = new InventoryCacheManager("Lanji");
//		InventoryCacheManager cache4 = new InventoryCacheManager("balaghat");
//		
//		System.out.println("Object count :" + cache2.cacheInstanceCount);
		
		
		//6 problem
		MicroserviceDeploymentConfig deplo = new MicroserviceDeploymentConfig();
		
		deplo.display();
		
		System.out.println("Driver.main() END ");
	}

}
