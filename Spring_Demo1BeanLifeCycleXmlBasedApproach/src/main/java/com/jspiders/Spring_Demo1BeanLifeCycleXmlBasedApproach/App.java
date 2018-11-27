package com.jspiders.Spring_Demo1BeanLifeCycleXmlBasedApproach;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
    	Dao_Class dao=(Dao_Class) applicationContext.getBean("dao");
    	Scanner scanner=new Scanner(System.in);
    	while(true)
    	{
    	System.out.println("press 1 insert operation");
    	System.out.println("press 2 read operation");
    	System.out.println("press 3 update operation");
    	System.out.println("press 4 delete operation");
    	System.out.println("press 5 close connection object");
    	System.out.println("enter your choice");
    	int n=scanner.nextInt();
    	switch (n) 
    	{
		case 1:
			System.out.println("enter id ");
	    	int id=scanner.nextInt();
	    	System.out.println("enter name ");
	    	String name=scanner.next();
	    	System.out.println("enter salary");
	    	double sal=scanner.nextDouble();
			dao.persist(id, name, sal);
			break;
		case 2:
			System.out.println("enter id ");
	    	int id2=scanner.nextInt();
			dao.load(id2);
			break;
		case 3:
			System.out.println("enter id ");
	    	int id3=scanner.nextInt();
	    	System.out.println("enter name ");
	    	String name3=scanner.next();
	    	System.out.println("enter salary");
	    	double sal3=scanner.nextDouble();
			dao.update(id3, name3, sal3);
			break;
		case 4:
			System.out.println("enter id ");
	    	int id4=scanner.nextInt();
			dao.delete(id4);
			break;
		default:
			applicationContext.close();
			break;
		}
    }
    	
    	
    	
    }
}
