package com.jspiders.Spring_Demo1FactoryClassWithFactoryBean;

public class Swift implements Car {

	public void start() 
	{
		System.out.println("Swift car is started");
	}

	public void accelerate() {
		System.out.println("Swift car is accelerated");
	}

	public void applyBreaks() {
		System.out.println("Swift car is stopped");
	}


}
