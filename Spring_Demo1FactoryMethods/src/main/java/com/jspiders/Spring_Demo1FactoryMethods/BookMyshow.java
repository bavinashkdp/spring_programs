package com.jspiders.Spring_Demo1FactoryMethods;

public class BookMyshow
{
	private static BookMyshow bookMyshow;
	private int tickets=1000;
	private BookMyshow() 
	{
		System.out.println("Book myshow object is created");
	}
	public static BookMyshow getInstance()
	{
		if(bookMyshow==null)
		{
			bookMyshow=new BookMyshow();
			return bookMyshow;
		}
		else
		{
			return bookMyshow;
		}
	}

	public void  printData()
	{
		System.out.println("no of tickets="+tickets);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new CloneNotSupportedException();
	}

}
