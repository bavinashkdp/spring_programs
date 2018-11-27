package com.jspiders.Spring_Demo1AutoWiringByUsingXml1;

public class Company 
{
	private Company()
	{
		System.out.println("company object is creaated");
	}
	private String companyName;
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", employee=" + employee + "]";
	}

	
	

}
