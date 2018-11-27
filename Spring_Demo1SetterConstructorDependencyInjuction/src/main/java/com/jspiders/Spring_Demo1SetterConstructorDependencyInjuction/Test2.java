package com.jspiders.Spring_Demo1SetterConstructorDependencyInjuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2
{
	public static void main(String[]args)
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring3.xml");
		Person person=(Person) applicationContext.getBean("pr1");
		System.out.println(person);
	}

}
