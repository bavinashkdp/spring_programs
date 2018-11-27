package com.jspiders.Spring_Demo1AutoWiringByUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByNameTest
{
	public static void main(String[]args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring2byName.xml");
		Car car=(Car)applicationContext.getBean("c4");
		System.out.println(car);
	}

}
