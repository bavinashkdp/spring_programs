package com.jspiders.Spring_Demo1FactoryClassWithStaticMethods;

public class CarFactory 
{
	private static String carName;

	public static String getCarName() {
		return carName;
	}

	public static void setCarName(String carName) {
		CarFactory.carName = carName;
	}
	public static Car getInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		Car car=(Car) Class.forName(carName).newInstance();
		return car;
	}
	

}
