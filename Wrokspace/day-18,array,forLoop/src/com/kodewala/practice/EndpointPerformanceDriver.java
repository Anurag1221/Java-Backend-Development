package com.kodewala.practice;

public class EndpointPerformanceDriver {

	public static void main(String[] args) {
		
		EndpointPerformance end1 = new EndpointPerformance("/api/users", 120);
		EndpointPerformance end2 = new EndpointPerformance("/api/orders", 850);
		EndpointPerformance end3 = new EndpointPerformance("/api/payments", 340);
		EndpointPerformance end4 = new EndpointPerformance("/api/products", 620);
		
		EndpointPerformance end[] = new EndpointPerformance[4];
		
		end[0] = end1;
		end[1] = end2;
		end[2] = end3;
		end[3] = end4;
		
		int highestResponseTime  = 0;
		String highestEndpoint = end[0].endpoints;
		
		int slowCount = 0;
		
		for(int i=0; i< end.length; i++) {
			
			//print the details
			System.out.println(end[i].endpoints + " " + end[i].responseTimes);
			System.out.println();
			
			//this condition finding response time slow
			if(end[i].responseTimes > 500) {
				
				System.out.println("Response time slow ");
				System.out.println();
				slowCount++;
			}
			
			//this condition finding highest response time
			if(end[i].responseTimes > highestResponseTime) {
				
				highestResponseTime = end[i].responseTimes;
				highestEndpoint = end[i].endpoints;
			}
			
		}
		

        System.out.println();
        System.out.println("Highest Response Time Endpoint: " + highestEndpoint);
        System.out.println("Highest Response Time: " + highestResponseTime + " ms");
        System.out.println("Total Slow Endpoints: " + slowCount);
		
	}

}
