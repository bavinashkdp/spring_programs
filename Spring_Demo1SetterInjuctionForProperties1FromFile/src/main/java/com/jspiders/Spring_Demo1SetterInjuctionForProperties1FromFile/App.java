package com.jspiders.Spring_Demo1SetterInjuctionForProperties1FromFile;

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
      /* ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
       Test test=(Test) applicationContext.getBean("t");
       System.out.println(test);
       test.print();*/
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring1.xml");
    	TestUse testUse=(TestUse) applicationContext.getBean("t1");
    	System.out.println(testUse);
    	testUse.print();
    }
}
