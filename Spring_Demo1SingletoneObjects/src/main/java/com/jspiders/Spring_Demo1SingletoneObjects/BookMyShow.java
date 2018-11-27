package com.jspiders.Spring_Demo1SingletoneObjects;

public class BookMyShow 
{
	private int tickates=300;
	private static BookMyShow bookMyShow;
	
	public static BookMyShow getInstance()
	{
		if (bookMyShow!=null)
		{
		bookMyShow=new BookMyShow();
		return bookMyShow;
		}
		else
		{
			return bookMyShow;
		}
	}
	public void getTickets()
	{
		System.out.println("no of tickets "+tickates);
	}

	

}
