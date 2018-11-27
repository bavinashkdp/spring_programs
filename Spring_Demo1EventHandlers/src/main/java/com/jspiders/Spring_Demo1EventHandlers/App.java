package com.jspiders.Spring_Demo1EventHandlers;

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
    	ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
    	applicationContext.start();
    	applicationContext.stop();
    	applicationContext.close();
    	applicationContext.refresh();
    }
}
