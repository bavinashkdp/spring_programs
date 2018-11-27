package com.jspiders.Spring_Demo1AutoWiringByUsingXml1;

public class Employee
{
	private Employee() 
	{
		System.out.println("employee object is created");
	}
	private String empName;
	private Employee_Adress employee_Adress;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee_Adress getEmployee_Adress() {
		return employee_Adress;
	}
	public void setEmployee_Adress(Employee_Adress employee_Adress) {
		this.employee_Adress = employee_Adress;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", employee_Adress=" + employee_Adress + "]";
	}
	


}
