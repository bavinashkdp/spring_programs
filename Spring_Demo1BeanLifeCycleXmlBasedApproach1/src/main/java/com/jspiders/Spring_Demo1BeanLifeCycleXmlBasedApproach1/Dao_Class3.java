package com.jspiders.Spring_Demo1BeanLifeCycleXmlBasedApproach1;

public class Dao_Class3 
{
	private Dao_Class3()
	{
		System.out.println("Dao_Class3 object is created");
	}
	public void myInit()
	{
		System.out.println("init method called in Dao_Class3");
	}
	public void myDestroy()
	{
		System.out.println("destroy method called in Dao_Class3");
	}

}
