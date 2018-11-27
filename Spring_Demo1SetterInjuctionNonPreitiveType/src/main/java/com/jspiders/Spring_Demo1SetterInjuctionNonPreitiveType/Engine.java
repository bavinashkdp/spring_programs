package com.jspiders.Spring_Demo1SetterInjuctionNonPreitiveType;

public class Engine 
{
	private String modelYear;
	 public Engine() 
	 {
		 System.out.println("engine object is created");
	}
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
