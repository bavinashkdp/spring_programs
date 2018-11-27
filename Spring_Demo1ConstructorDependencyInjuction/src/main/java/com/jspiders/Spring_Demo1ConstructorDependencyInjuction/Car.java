package com.jspiders.Spring_Demo1ConstructorDependencyInjuction;

public class Car
{
	private String carName;
	private Engine engine;
	public Car(String carName, Engine engine) {
		super();
		this.carName = carName;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", engine=" + engine + "]";
	}
	

}
