package com.jspiders.Spring_Demo1StaticVariableDependencyInjuction;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
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
    	Car car=(Car) applicationContext.getBean("c");
    	car.printData();
    }
}
