package com.jspiders.Spring_Demo1ConstructorDependencyInjuction;

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
    	Car car=(Car) applicationContext.getBean("c1");
    	System.out.println(car);
    }
}
