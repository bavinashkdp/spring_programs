package com.jspiders.javaApp.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jspiders.javaApp.engine.Engine;

@Component
public class Car
{
	@Autowired
	private Engine engine;

	

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}
	

}
