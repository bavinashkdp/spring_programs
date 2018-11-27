package com.jspiders.Spring_Demo1BeanLifeCycleAnnotationBasedApproach;

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
    	Dao_Class dao_Class=(Dao_Class) applicationContext.getBean("dao");
    	
    	Scanner scanner=new Scanner(System.in);
    	while(true)
    	{
    	System.out.println("Press 1 for insert data");
    	System.out.println("Press 2 for read data");
    	System.out.println("Press 3 for updateName ");
    	System.out.println("Press 4 for update salary");
    	System.out.println("Press 5 for update all");
    	System.out.println("Press 6 for delete data");
    	System.out.println("enter your choice");
    	int n=scanner.nextInt();
    	switch (n) {
		case 1:
					System.out.println("enter id");
					int id=scanner.nextInt();
					System.out.println("enter name");
					String name=scanner.next();
					System.out.println("enter salary");
					double salary=scanner.nextDouble();
					dao_Class.save(id, name, salary);
			break;
		case 2:
			System.out.println("enter id");
			int id2=scanner.nextInt();
			dao_Class.get(id2);
			break;
		case 3:
			System.out.println("enter id");
			int id3=scanner.nextInt();
			System.out.println("enter name");
			String name3=scanner.next();
			dao_Class.updateName(id3, name3);
			break;
		case 4:
			System.out.println("enter id");
			int id4=scanner.nextInt();
			System.out.println("enter salary");
			double salary4=scanner.nextDouble();
			dao_Class.updateSalary(id4, salary4);
	break;
		case 5:
			System.out.println("enter id");
			int id5=scanner.nextInt();
			System.out.println("enter name");
			String name5=scanner.next();
			System.out.println("enter salary");
			double salary5=scanner.nextDouble();
			dao_Class.updateAll(id5, name5, salary5);
			break;
		case 6:
			System.out.println("enter id");
			int id6=scanner.nextInt();
			dao_Class.delete(id6);
			break;
		default:
			applicationContext.close();
			break;
					}
    	
    	}
    }
}
