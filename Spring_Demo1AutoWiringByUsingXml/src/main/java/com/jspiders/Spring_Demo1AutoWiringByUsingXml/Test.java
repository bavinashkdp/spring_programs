package com.jspiders.Spring_Demo1AutoWiringByUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring1.xml");
    	Car car=(Car) applicationContext.getBean("c2");
    	System.out.println(car);

	}

}
