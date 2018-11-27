package com.jspiders.Spring_Demo1SetterInjuction;

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
    	/*Student student=new Student();
    	System.out.println(student);*/
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
    	Student student=(Student) applicationContext.getBean("s1");
    	System.out.println(student);
    }
}
