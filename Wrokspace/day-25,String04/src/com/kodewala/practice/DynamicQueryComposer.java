package com.kodewala.practice;

public class DynamicQueryComposer {

	public StringBuilder composeQuery(int minimumAmount, String regionCode) {
		
		StringBuilder start = new StringBuilder("SELECT * FROM transactions");
		
		if (minimumAmount > 0) {
			start.append(" WHERE amount >=" + minimumAmount);
		} 
		else if (regionCode != null) {
			start.append("region =" + regionCode);
		}
		else {
			start.append(";");
		}
		return start;
	}
}

