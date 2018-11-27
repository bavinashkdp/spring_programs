package com.jspiders.Spring_Demo1BeanLifeCycleXmlBasedApproach1;

public class Dao_Class1 
{
	private Dao_Class1()
	{
		System.out.println("Dao_Class1 object is created");
	}
	public void myInit()
	{
		System.out.println("init method called in Dao_Class1");
	}
	public void myDestroy()
	{
		System.out.println("destroy method called in Dao_Class1");
	}

}
