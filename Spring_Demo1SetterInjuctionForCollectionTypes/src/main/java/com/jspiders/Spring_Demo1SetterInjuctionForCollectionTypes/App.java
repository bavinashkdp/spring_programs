package com.jspiders.Spring_Demo1SetterInjuctionForCollectionTypes;

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
    	Test test=(Test) applicationContext.getBean("t");
    	System.out.println(test);
    	test.show();
    	
    }
}
