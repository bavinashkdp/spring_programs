package com.jspiders.Spring_Demo0;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("bean factory");
    	Resource resource=new ClassPathResource("spring.xml");
    	BeanFactory beanFactory=new XmlBeanFactory(resource);
    	System.out.println("Bean scope is prototype");
    	HellowWorld hellowWorld=(HellowWorld) beanFactory.getBean("h1");
    	hellowWorld.display();
    	HellowWorld hellowWorld2=(HellowWorld) beanFactory.getBean("h1");
    	hellowWorld2.display();
    	System.out.println(hellowWorld==hellowWorld2);
    	System.out.println("****************************");
    	System.out.println("Bean scope is singleton");
    	HellowWorld hellowWorld3=(HellowWorld) beanFactory.getBean("h2");
    	hellowWorld3.display();
    	HellowWorld hellowWorld4=(HellowWorld) beanFactory.getBean("h2");
    	hellowWorld4.display();
    	System.out.println("****************************");
    	System.out.println("applicarion context");
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring1.xml");
    	//it will create 2 objects(laptop,helloworld) while loading the spring.xml
    	System.out.println("****************************");
    	System.out.println("Bean scope is prototype");
    	Laptop laptop=(Laptop) applicationContext.getBean("l1");
    	laptop.Show();
    	Laptop laptop2=(Laptop) applicationContext.getBean("l1");
    	laptop2.Show();
    	System.out.println("****************************");
    	System.out.println("Bean scope is singletone");
    	Laptop laptop3=(Laptop) applicationContext.getBean("l2");
    	laptop3.Show();
    	Laptop laptop4=(Laptop) applicationContext.getBean("l2");
    	laptop4.Show();
    }
}
