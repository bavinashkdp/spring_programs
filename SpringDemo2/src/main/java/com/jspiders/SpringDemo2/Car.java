package com.jspiders.SpringDemo2;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	public void drive() 
	{
		System.out.println("chal raha hai!!!!!!!");
	}

}
