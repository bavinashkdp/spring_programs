package com.jspiders.Spring_Demo1BeanLifeCycleXmlBasedApproach1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");//init method call
    	applicationContext.close();// detroy method call
    }
}
