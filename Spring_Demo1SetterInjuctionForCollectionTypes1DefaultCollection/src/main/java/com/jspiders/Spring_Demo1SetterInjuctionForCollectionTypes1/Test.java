package com.jspiders.Spring_Demo1SetterInjuctionForCollectionTypes1;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test 
{
	private Vector fruits;
	private TreeSet cricketers;
	private Hashtable countriesCapitals;
	
	
	public Vector getFruits() {
		return fruits;
	}


	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}


	public TreeSet getCricketers() {
		return cricketers;
	}


	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}


	public Hashtable getCountriesCapitals() {
		return countriesCapitals;
	}


	public void setCountriesCapitals(Hashtable countriesCapitals) {
		this.countriesCapitals = countriesCapitals;
	}

	
	@Override
	public String toString() {
		return "Test [fruits=" + fruits + ", cricketers=" + cricketers + ", countriesCapitals=" + countriesCapitals
				+ "]";
	}


	public void display()
	{
		for (Object object : fruits)
		{
			System.out.println(object);
		}
		for (Object object : cricketers)
		{
			System.out.println(object);
		}
		Set keySet=countriesCapitals.keySet();
		for (Object key : keySet) 
		{
		System.out.println(key+":"+countriesCapitals.get(key));	
		}
	}
}
