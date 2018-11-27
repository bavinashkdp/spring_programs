package com.jspiders.SpringDemo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike  implements Vehicle
{
	@Autowired
	private Tyre tyre;
	   
	public Tyre getTyre() 
	{
	return tyre;
	}

	public void setTyre(Tyre tyre) 
	{
	this.tyre = tyre;
	}

 public void drive() 
 {
 System.out.println("Bike "+tyre+" it contains "+tyre.getBrand()+" brand tyres");	
}
}
