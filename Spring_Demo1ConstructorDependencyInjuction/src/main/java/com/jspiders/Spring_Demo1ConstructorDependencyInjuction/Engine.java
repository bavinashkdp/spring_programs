package com.jspiders.Spring_Demo1ConstructorDependencyInjuction;

public class Engine
{
	private String modelYear;

	public Engine(String modelYear) {
		super();
		this.modelYear = modelYear;
	}

	@Override
	public String toString() {
		return "Engine [modelYear=" + modelYear + "]";
	}
	

}
