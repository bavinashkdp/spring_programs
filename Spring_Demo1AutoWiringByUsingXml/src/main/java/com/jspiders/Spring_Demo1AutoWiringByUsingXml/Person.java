package com.jspiders.Spring_Demo1AutoWiringByUsingXml;

public class Person
{
	private String pName;
	private AdharCard adharCard;
	public Person(String pName, AdharCard adharCard) {
		super();
		this.pName = pName;
		this.adharCard = adharCard;
	}
	@Override
	public String toString() {
		return "Person [pName=" + pName + ", adharCard=" + adharCard + "]";
	}
	

}
