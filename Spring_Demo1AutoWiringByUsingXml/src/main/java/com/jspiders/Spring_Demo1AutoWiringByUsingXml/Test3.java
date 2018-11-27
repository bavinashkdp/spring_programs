package com.jspiders.Spring_Demo1AutoWiringByUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring2byType1.xml");
		Car car=(Car) applicationContext.getBean("c4");
			System.out.println(car);
	}

}
