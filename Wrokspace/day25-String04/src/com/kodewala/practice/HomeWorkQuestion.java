package com.kodewala.practice;

public class HomeWorkQuestion {

	public StringBuilder displayQuery(String Department, int Salary, String joiningDate) {

		StringBuilder start = new StringBuilder("SELECT * FROM employee WHERE 1=1");

		if (Department != null)
		{
			start.append(" AND >=" + Department);
		}
		else if (Salary >= 0)
		{
			start.append(" AND =" + Salary);
		}
		else if(joiningDate != null)
		{
			start.append(" AND =" + joiningDate);
		}
		else
		{
			start.append(";");
		}
		return start;
	}

}
