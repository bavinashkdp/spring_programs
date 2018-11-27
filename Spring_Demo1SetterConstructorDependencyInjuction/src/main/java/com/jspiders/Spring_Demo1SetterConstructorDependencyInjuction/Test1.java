package com.jspiders.Spring_Demo1SetterConstructorDependencyInjuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring2.xml");
		Person person=(Person) applicationContext.getBean("pr");
		System.out.println(person);
	}

}
