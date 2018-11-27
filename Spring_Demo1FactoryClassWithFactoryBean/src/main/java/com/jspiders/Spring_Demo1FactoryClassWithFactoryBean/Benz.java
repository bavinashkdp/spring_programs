package com.jspiders.Spring_Demo1FactoryClassWithFactoryBean;

public class Benz implements Car {

	public void start() 
	{
		System.out.println("Benz car is started");
	}

	public void accelerate() {
		System.out.println("Benz car is accelerated");
	}

	public void applyBreaks() {
		System.out.println("Benz car is stopped");
	}

}
