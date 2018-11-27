package com.jspiders.Spring_Demo1AutoWiringByUsingXmlAnnotation1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.javaApp.Car.Car;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
    	Car car=(Car) applicationContext.getBean(Car.class);
    	System.out.println(car);
    }
}
