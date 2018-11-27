package com.jspiders.Spring_Demo1MethodReplacer;

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
    	Bank bank=(Bank) applicationContext.getBean("b1");
    	bank.deposit();
    	
    	bank.withDraw();
    	bank.calculateInterest();
    	System.out.println("*************************");
    	Bank bank2=(Bank) applicationContext.getBean("b2");
    	bank2.deposit();
    	
    	bank2.withDraw();
    	bank2.calculateInterest();
    }
}
