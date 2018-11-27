package com.jspiders.Spring_Demo1ConstructionInjuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
    	Student student=(Student) applicationContext.getBean("s1");
    	System.out.println(student);
    }
}
