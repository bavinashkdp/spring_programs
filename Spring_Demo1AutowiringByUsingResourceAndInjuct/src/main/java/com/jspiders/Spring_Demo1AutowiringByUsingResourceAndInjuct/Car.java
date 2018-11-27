package com.jspiders.Spring_Demo1AutowiringByUsingResourceAndInjuct;



import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;


public class Car
{
	@Resource//byName autowiring by using jdk annotation
	//@Inject//byType autowiring by using jdk annotations
	@Qualifier("e1")
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}
	

}
