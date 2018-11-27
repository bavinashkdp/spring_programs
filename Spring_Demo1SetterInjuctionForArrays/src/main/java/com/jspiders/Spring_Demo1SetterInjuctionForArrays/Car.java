package com.jspiders.Spring_Demo1SetterInjuctionForArrays;

import java.util.Arrays;

public class Car 
{
	private String[]carnames;
	private Engine[] engines;
	public String[] getCarnames() {
		return carnames;
	}
	public void setCarnames(String[] carnames) {
		this.carnames = carnames;
	}
	public Engine[] getEngines() {
		return engines;
	}
	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
	@Override
	public String toString() {
		return "Car [carnames=" + Arrays.toString(carnames) + ", engines=" + Arrays.toString(engines) + "]";
	}
	public void display()
	{
		for (String string : carnames) 
		{
			System.out.println(string);
		}
		for (Engine engine : engines)
		{
		System.out.println(engine.getModelYear());	
		}
	}

}
