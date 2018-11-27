package com.jspiders.Spring_Demo1SetterInjuctionForCollectionTypes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test 
{
	private List fruits;//by default it will take arraylist instance
	private Set cricketers;//by default it will take linked-hashset instance
	private Map countriesAndCapitals;//by default it will take linked-hashmap instance
	public List getFruits() {
		return fruits;
	}
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public Set getCricketers() {
		return cricketers;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public Map getCountriesAndCapitals() {
		return countriesAndCapitals;
	}
	public void setCountriesAndCapitals(Map countriesAndCapitals) {
		this.countriesAndCapitals = countriesAndCapitals;
	}
	@Override
	public String toString() {
		return "Test [fruits=" + fruits + ", cricketers=" + cricketers + ", countriesAndCapitals="
				+ countriesAndCapitals + "]";
	}
	public void show()
	{
		for (Object object : cricketers)
		{
		System.out.println(object);	
		}
		for (Object object : cricketers)
		{
		System.out.println(object);	
		}
		Set setofkeys=countriesAndCapitals.keySet();
		for (Object key : setofkeys) 
		{
			System.out.println(key+":"+countriesAndCapitals.get(key));
		}
	}
	
}
