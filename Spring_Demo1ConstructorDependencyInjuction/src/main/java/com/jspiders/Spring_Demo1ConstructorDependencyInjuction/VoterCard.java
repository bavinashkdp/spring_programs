package com.jspiders.Spring_Demo1ConstructorDependencyInjuction;

public class VoterCard 
{
	private String adress;

	public VoterCard(String adress) {
		super();
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "VoterCard [adress=" + adress + "]";
	}
	

}
