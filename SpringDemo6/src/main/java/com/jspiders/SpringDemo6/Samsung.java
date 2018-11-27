package com.jspiders.SpringDemo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung 
{
	@Autowired
	@Qualifier("mediaTek")
	private Mobileprocessor mobileprocessor;
	
	public Mobileprocessor getMobileprocessor() {
		return mobileprocessor;
	}

	public void setMobileprocessor(Mobileprocessor mobileprocessor) {
		this.mobileprocessor = mobileprocessor;
	}

	public void config()
	{
		System.out.println("octa core, 4gb ram ,18mp");
		mobileprocessor.process();
	}

}
