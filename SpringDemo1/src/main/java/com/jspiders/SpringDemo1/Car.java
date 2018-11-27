package com.jspiders.SpringDemo1;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle
{
	public void drive() 
	{
	System.out.println("car driving");	
	}

}
