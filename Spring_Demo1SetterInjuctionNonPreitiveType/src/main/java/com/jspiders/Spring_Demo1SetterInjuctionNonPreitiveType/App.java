package com.jspiders.Spring_Demo1SetterInjuctionNonPreitiveType;

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
    	/*System.out.println("pass by referance approach");
    	String[]arr={"engine.xml","car.xml"};
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext(arr);
    	Car car=(Car) applicationContext.getBean("c");
    	System.out.println(car);
    	*/
    	System.out.println("inner bean approach");
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("car_engine.xml");
    	Car car=(Car) applicationContext.getBean("c1");
    	System.out.println(car);

    }
}
