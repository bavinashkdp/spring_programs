package com.jspiders.Spring_Demo1AutoWiringByUsingXmlAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car
{
	@Autowired
	@Qualifier(value="e1")
	private Engine engine;
	/*
	with out stters and getters  / constructors also
	we can do dependency injuction
	*/

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}
	

}
