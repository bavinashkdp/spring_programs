package com.jspiders.Spring_Demo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource resource=new ClassPathResource("spring.xml");
    	System.out.println("scope is singletone-core container-bean factory");
    	BeanFactory beanFactory=new XmlBeanFactory(resource);
    	Book book=(Book) beanFactory.getBean("b1");
    	book.show();	
    	Book book2=(Book) beanFactory.getBean("b1");
    	book2.show();	
    	System.out.println("scope is prototype-core container-bean factory");
    	BeanFactory beanFactory2=new XmlBeanFactory(resource);
    	Book book3=(Book) beanFactory2.getBean("b2");
    	book3.show();	
    	Book book4=(Book) beanFactory2.getBean("b2");
    	book4.show();	
    	System.out.println("**************************************************");
    	System.out.println("scope is singletone-jee container-Application context");
    	ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("spring1.xml");
    	Book book5=(Book) applicationContext.getBean("b3");
    	book5.show();
    	Book book6=(Book) applicationContext.getBean("b3");
    	book6.show();
    	
    	System.out.println("scope is prototype-jee container-Application context");
        
    	
    	ApplicationContext  applicationContext2=new ClassPathXmlApplicationContext("spring1.xml");
    	Book book7=(Book) applicationContext2.getBean("b4");
    	book7.show();
    	Book book8=(Book) applicationContext2.getBean("b4");
    	book8.show();
    	
    	System.out.println("**************************************************");
    	System.out.println("*******************private constructors*************************");
    	System.out.println("scope is singletone-jee container-Application context");
    	ApplicationContext  applicationContext3=new ClassPathXmlApplicationContext("spring1.xml");
    	Book book9=(Book) applicationContext3.getBean("b3");
    	book9.show();
    	Book book10=(Book) applicationContext3.getBean("b3");
    	book10.show();
    	
    	System.out.println("scope is prototype-jee container-Application context");
        
    	
    	ApplicationContext  applicationContext4=new ClassPathXmlApplicationContext("spring1.xml");
    	Book book11=(Book) applicationContext4.getBean("b4");
    	book11.show();
    	Book book12=(Book) applicationContext4.getBean("b4");
    	book12.show();
    	
    	
    }
}
