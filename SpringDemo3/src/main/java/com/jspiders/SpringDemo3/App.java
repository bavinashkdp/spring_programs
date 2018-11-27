package com.jspiders.SpringDemo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle vehicle=(Vehicle) applicationContext.getBean("car");
    	vehicle.drive();
    }
}
