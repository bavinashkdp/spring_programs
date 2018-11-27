package com.jspiders.Spring_Demo1SetterInjuctionForProperties1FromFile;

import java.util.Properties;
import java.util.Set;

public class TestUse 
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
		return "TestUse [properties=" + properties + "]";
	}
	public void print()
	{
		Set setOfKeys=properties.keySet();
		for (Object key : setOfKeys) {
			System.out.println(key+"="+properties.getProperty((String) key));
		}
	}

}
