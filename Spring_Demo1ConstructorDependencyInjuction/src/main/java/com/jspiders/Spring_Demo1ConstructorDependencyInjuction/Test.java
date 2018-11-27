package com.jspiders.Spring_Demo1ConstructorDependencyInjuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring1.xml");
		Person person=(Person) applicationContext.getBean("p1");
		System.out.println(person);
	}

}
