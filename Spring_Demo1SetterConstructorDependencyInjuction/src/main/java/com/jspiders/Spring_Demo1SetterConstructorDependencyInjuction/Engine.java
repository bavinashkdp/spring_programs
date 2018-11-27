package com.jspiders.Spring_Demo1SetterConstructorDependencyInjuction;

public class Engine
{
	private String modelYear;

	public Engine(String modelYear) {
		super();
		this.modelYear = modelYear;
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
