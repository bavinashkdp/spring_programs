package com.jspiders.Spring_Demo1SetterInjuctionForProperties1FromFile;

import java.util.Properties;
import java.util.Set;

public class Test
{
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Test [properties=" + properties + "]";
	}
	public void print()
	{
		Set keys=properties.keySet();
		for (Object key : keys) 
		{
			System.out.println(key+"="+properties.getProperty((String) key));
		}
	}

}
