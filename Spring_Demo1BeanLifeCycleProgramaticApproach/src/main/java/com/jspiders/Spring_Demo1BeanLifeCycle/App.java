package com.jspiders.Spring_Demo1BeanLifeCycle;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.java_cup.internal.runtime.Symbol;

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
    	while(true)
    	{
    	System.out.println("enter oprtion 1 for insert data  ");
    	System.out.println("enter oprtion 2 for read data from databse ");
    	System.out.println("enter oprtion 3 for update data  to db ");
    	System.out.println("enter oprtion 4 for delete data from databse ");
    	System.out.println("press 5 for closing connection object");
    	Scanner scanner=new Scanner(System.in);
    	int choice=scanner.nextInt();
    	switch (choice) {
		case 1:
			System.out.println("enter id??");
			int id=scanner.nextInt();
			System.out.println("enter name??");
			String name=scanner.next();
			System.out.println("enter salary");
			double sal=scanner.nextDouble();
				dao.save(id,name, sal);
			break;
		case 2:
			System.out.println("enter id??");
			
			int id2=scanner.nextInt();
				dao.get(id2);
			break;
		case 3:
			System.out.println("enter id??");
			int id3=scanner.nextInt();
			System.out.println("enter name??");
			String name3=scanner.next();
			System.out.println("enter salary");
			double sal3=scanner.nextDouble();
				dao.update(id3,name3, sal3);
			break;
		case 4:
			System.out.println("enter id??");
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
