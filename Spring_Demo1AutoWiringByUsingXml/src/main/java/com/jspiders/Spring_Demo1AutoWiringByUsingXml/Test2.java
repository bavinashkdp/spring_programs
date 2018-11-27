package com.jspiders.Spring_Demo1AutoWiringByUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 
{
	public static void main(String[]args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring2byType.xml");
		Car car=(Car) applicationContext.getBean("c3");
		System.out.println(car);
	}

}
