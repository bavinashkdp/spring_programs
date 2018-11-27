package com.jspiders.Spring_Demo1FactoryClassWithFactoryBean;

public class Audi implements Car {

	public void start() 
	{
		System.out.println("audi car is started");
	}

	public void accelerate() {
		System.out.println("audi car is accelerated");
	}

	public void applyBreaks() {
		System.out.println("audi car is stopped");
	}

}
