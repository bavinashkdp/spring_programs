package com.jspiders.Spring_Demo1SetterInjuctionDepends_onDemo;

public class A
{
	private B b;
	public A() 
	{
		System.out.println("a object is created");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
	
 
}
