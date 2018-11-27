package com.jspiders.SpringDemo2;

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
    //	Vehicle vehicle=(Vehicle) applicationContext.getBean("bike");
   // 	vehicle.drive();
    	Tyre tyre=(Tyre) applicationContext.getBean("tyre");
    	System.out.println(tyre);
    }
}
