package com.jspiders.Spring_Demo1SetterConstructorDependencyInjuction;

public class PanCard 
{
	private int panId;
	private  String location;
	
	public PanCard(int panId, String location) {
		super();
		this.panId = panId;
		this.location = location;
	}
	public int getPanId() {
		return panId;
	}
	public void setPanId(int panId) {
		this.panId = panId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "PanCard [panId=" + panId + ", location=" + location + "]";
	}
	

}
