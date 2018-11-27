package com.jspiders.Spring_Demo1ConstructorDependencyInjuction;

public class Person 
{
	private String name;
	private VoterCard voterCard;
	public Person(String name, VoterCard voterCard) {
		super();
		this.name = name;
		this.voterCard = voterCard;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", voterCard=" + voterCard + "]";
	}
	
	

}
