package com.kodewala.collection.practice50;

import java.util.ArrayList;

public class ActiveServerRegistry {

	public static void main(String[] args) {
		ArrayList<String> serverIds = new ArrayList<String>(5);
		 // Add first 5 server IDs
        serverIds.add("SRV-1001");
        serverIds.add("SRV-1002");
        serverIds.add("SRV-1003");
        serverIds.add("SRV-1004");
        serverIds.add("SRV-1005");

        // Add another 5 server IDs
        serverIds.add("SRV-1006");
        serverIds.add("SRV-1007");
        serverIds.add("SRV-1008");
        serverIds.add("SRV-1009");
        serverIds.add("SRV-1010");
        
        serverIds.remove(5);
        serverIds.remove(6);
        
        serverIds.add("SRV-10011");
        serverIds.add("SRV-1012");
        serverIds.add("SRV-1013");
        
        System.out.println(serverIds);
        
		

	}

}
