package com.jspiders.Spring_Demo1AutoWiringByUsingXml;

public class Student_Details
{
	private String adress;
	public Student_Details() {
		// TODO Auto-generated constructor stub
	}

	public Student_Details(String adress) {
		super();
		this.adress = adress;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Student_Details [adress=" + adress + "]";
	}
	
	

}
