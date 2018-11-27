package com.jspiders.Spring_Demo1LookUpMethodDependencyInjuction;

public class Truck 
{
	public Engine getTruckEngine()
	{
		Engine engine=new Engine();
		engine.setEngineName("mrf truck engine");
		return engine;
		
	}

}
