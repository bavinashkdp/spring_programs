package com.jspiders.Spring_Demo1AutoWiringByUsingXml1;

public class Employee_Adress 
{
	public Employee_Adress() 
	{
		System.out.println("employee_adress object is created");
	}
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee_Adress [location=" + location + "]";
	}
	

}
