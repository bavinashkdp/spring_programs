package com.jspiders.Spring_Demo1AutoWiringByUsingXml1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		Company company=(Company) applicationContext.getBean("c");
		System.out.println(company);
	}

}
