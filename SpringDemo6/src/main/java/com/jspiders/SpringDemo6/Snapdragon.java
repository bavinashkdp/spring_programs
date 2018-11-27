package com.jspiders.SpringDemo6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Snapdragon implements Mobileprocessor {

	public void process() 
	{
		System.out.println("world best cpu");
	}

}
