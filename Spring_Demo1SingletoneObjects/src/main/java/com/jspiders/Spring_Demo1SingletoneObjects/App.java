package com.jspiders.Spring_Demo1SingletoneObjects;

import java.util.Calendar;
import java.util.Enumeration;
import java.util.ResourceBundle;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
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
    	/*BookMyShow bookMyShow2=BookMyShow.getInstance();
    	bookMyShow2.getTickets();*/
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
    	BookMyShow bookMyShow=(BookMyShow) applicationContext.getBean("b1");
    	bookMyShow.getTickets();
    
    	/*Calendar calendar2=Calendar.getInstance();
    	System.out.println(calendar2.getTime());*/
    	ApplicationContext applicationContext2=new ClassPathXmlApplicationContext("spring.xml");
    	Calendar calendar=(Calendar) applicationContext2.getBean("c");
    	System.out.println(calendar.getTime());
    	
    	ResourceBundle bundle=ResourceBundle.getBundle("hibernate");
    	Enumeration<String>keys=bundle.getKeys();
    	while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			System.out.println(key+"="+bundle.getString(key));
		}
    	
    	
    }
}
