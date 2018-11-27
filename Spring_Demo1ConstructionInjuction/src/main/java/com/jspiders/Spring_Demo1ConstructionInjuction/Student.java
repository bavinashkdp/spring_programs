package com.jspiders.Spring_Demo1ConstructionInjuction;

public class Student 
{
	private int sId;
	private String sName;
	private String branch;
	public Student(int sId, String sName, String branch) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", branch=" + branch + "]";
	}
	

}
