package com.jspiders.Spring_Demo1AutoWiringByUsingXml;

public class AdharCard 
{
	private String adress;

	public AdharCard(String adress) {
		super();
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "AdharCard [adress=" + adress + "]";
	}
	

}
