package com.jspiders.Spring_Demo1FactoryClassWithInstanceMethods;

public class CarFactory 
{
	private String carName;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public Car getInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
	Car car=(Car) Class.forName(carName).newInstance();
	return car;
	}

}
