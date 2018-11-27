package com.jspiders.Spring_Demo1MethodReplacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCalculateInterest implements MethodReplacer {

	public Object reimplement(Object obj, Method method, Object[] arrs) throws Throwable 
	{
		System.out.println("reimplement() called in NewCalculateInterest");
		return null;
	}

}
