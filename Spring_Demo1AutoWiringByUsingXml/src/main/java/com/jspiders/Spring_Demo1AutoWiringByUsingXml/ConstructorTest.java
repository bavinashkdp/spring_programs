package com.jspiders.Spring_Demo1AutoWiringByUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorTest
{
	public static void main(String[]args)
		{
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring2Constructor.xml");
			Person person=(Person) applicationContext.getBean("p1");
			System.out.println(person);
		}
}
