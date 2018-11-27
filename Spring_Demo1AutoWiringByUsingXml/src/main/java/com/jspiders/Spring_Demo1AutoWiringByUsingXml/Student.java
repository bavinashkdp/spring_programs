package com.jspiders.Spring_Demo1AutoWiringByUsingXml;

public class Student 
{
	private String sName;
	private Student_Details details;
	public Student() {
	}
	
	public Student(String sName, Student_Details details) {
		super();
		this.sName = sName;
		this.details = details;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Student_Details getDetails() {
		return details;
	}
	public void setDetails(Student_Details details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", details=" + details + "]";
	}
	
	

}
