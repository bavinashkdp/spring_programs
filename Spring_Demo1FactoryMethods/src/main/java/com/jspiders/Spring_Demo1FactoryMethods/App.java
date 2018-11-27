package com.jspiders.Spring_Demo1FactoryMethods;


import java.awt.print.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;

import javax.xml.validation.Validator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.istack.internal.logging.Logger;

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
    	Test test2=(Test) applicationContext.getBean("t");
    	System.out.println(test==test2);
    	
    	
    	/*Calendar calendar=Calendar.getInstance();
    	System.out.println(calendar.getTime());*/
    	
    	Calendar calendar=(Calendar) applicationContext.getBean("c");
    	System.out.println(calendar.getTime());
    	Calendar calendar1=(Calendar) applicationContext.getBean("c");
    	System.out.println(calendar1.getTime());
    	System.out.println(calendar==calendar1);
    	
    	BookMyshow bookMyshow= (BookMyshow) applicationContext.getBean("b");
    	bookMyshow.printData();
    	BookMyshow bookMyshow2= (BookMyshow) applicationContext.getBean("b");
    	bookMyshow2.printData();
    	System.out.println(bookMyshow==bookMyshow2);
    	
    	
    }
}
