package com.jspiders.Spring_Demo1FactoryClassWithFactoryBean;

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
    	Car car=(Car) applicationContext.getBean("cf");
    	car.start();
    	car.accelerate();
    	car.applyBreaks();
    }
}
