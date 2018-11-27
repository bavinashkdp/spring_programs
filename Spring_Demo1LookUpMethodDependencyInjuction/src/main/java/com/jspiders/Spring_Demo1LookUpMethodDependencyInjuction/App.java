package com.jspiders.Spring_Demo1LookUpMethodDependencyInjuction;

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
    	System.out.println("<!-- lookup-method  Dependency injuction for interface  Car -->");
    	Car car=(Car) applicationContext.getBean("c");
    	System.out.println(car.getEngine());
    	System.out.println(car.getClass().getCanonicalName());
    	
    	System.out.println("<!-- lookup-method  Dependency injuction for abstract class  Buss -->");
    	Buss buss=(Buss) applicationContext.getBean("b");
    	System.out.println(buss.getBusEngine());
    	System.out.println(buss.getClass().getCanonicalName());
    	System.out.println("<!-- lookup-method  Dependency injuction for concrete  class overriding methods  Truck -->");
    	Truck truck=(Truck) applicationContext.getBean("t");
    	
    	System.out.println(truck.getTruckEngine());
    	System.out.println(truck.getClass().getCanonicalName());
    	
    }
}
