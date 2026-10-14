package com.kodewala.practice;

public class InventoryCacheManager {
	
	public static int cacheInstanceCount = 0;
	
	public InventoryCacheManager() {
		super();
		System.out.println("InventoryCacheManager");	
	}

	public InventoryCacheManager(String regionName) {
		super();
		System.out.println("Region Name :" + regionName);
	}
	
	//iib
		{
			cacheInstanceCount = cacheInstanceCount + 1;
		}

}
