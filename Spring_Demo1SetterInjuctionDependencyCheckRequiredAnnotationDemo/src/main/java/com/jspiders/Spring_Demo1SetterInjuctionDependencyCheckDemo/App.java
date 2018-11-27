package com.jspiders.Spring_Demo1SetterInjuctionDependencyCheckDemo;

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
    /*ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
    Car car=(Car) applicationContext.getBean("c");
    System.out.println(car);*/
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring1.xml");
    	
    	Dao_Class dao=(Dao_Class) applicationContext.getBean("dao");
    	System.out.println(dao);
    	
    	
    }
}
