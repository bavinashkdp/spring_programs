package com.jspiders.Spring_Demo1SetterConstructorDependencyInjuction;

public class Person 
{
	private long phoneNum;
	private String name;
	private PanCard panCard;
	public Person(long phoneNum, String name, PanCard panCard) {
		super();
		this.phoneNum = phoneNum;
		this.name = name;
		this.panCard = panCard;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PanCard getPanCard() {
		return panCard;
	}
	public void setPanCard(PanCard panCard) {
		this.panCard = panCard;
	}
	@Override
	public String toString() {
		return "Person [phoneNum=" + phoneNum + ", name=" + name + ", panCard=" + panCard + "]";
	}
	
	
	

}
