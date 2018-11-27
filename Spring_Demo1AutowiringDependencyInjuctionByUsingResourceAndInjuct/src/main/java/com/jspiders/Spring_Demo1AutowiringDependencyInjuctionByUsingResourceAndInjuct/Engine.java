package com.jspiders.Spring_Demo1AutowiringDependencyInjuctionByUsingResourceAndInjuct;

public class Engine 
{
	private String modelYear;

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	@Override
	public String toString() {
		return "Engine [modelYear=" + modelYear + "]";
	}
	

}
