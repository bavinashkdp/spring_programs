package com.jspiders.Spring_Demo1FactoryClassWithFactoryBean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory  implements FactoryBean
{
	private String carName;

	public String getCarName() {
		return carName;
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
/*	public Car getInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		Class c=Class.forName(carName);
		Car car=(Car) c.newInstance();
		return car;
	}
	*/

	public Object getObject() throws Exception 
	{
		Class c=Class.forName(carName);
		Car car=(Car) c.newInstance();
		return car;
	}

	public Class getObjectType() {
		return Car.class;
	}

	public boolean isSingleton() {
		return true;
	}

}
