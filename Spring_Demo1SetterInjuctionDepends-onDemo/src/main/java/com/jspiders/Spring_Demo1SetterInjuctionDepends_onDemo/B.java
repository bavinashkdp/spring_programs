package com.jspiders.Spring_Demo1SetterInjuctionDepends_onDemo;

public class B 
{
	private C c;
	public B() 
	{
		System.out.println("B object is created");
	}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "B [c=" + c + "]";
	}

	

}
