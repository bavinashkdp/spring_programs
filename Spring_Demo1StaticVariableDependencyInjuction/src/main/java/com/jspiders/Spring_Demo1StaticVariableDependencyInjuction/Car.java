package com.jspiders.Spring_Demo1StaticVariableDependencyInjuction;

public class Car 
{
	private static String carName;
	public static String getCarName() {
		return carName;
	}

	public static void setCarName(String carName) {
		Car.carName = carName;
	}
	public static void printData()
	{
		System.out.println("carName is:"+carName);
	}

	
	
}
