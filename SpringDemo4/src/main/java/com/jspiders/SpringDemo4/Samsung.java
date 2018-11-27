package com.jspiders.SpringDemo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//@Component
public class Samsung 
{
	@Autowired
	private SnapDragon dragon;
	
	public SnapDragon getDragon() {
		return dragon;
	}

	public void setDragon(SnapDragon dragon) {
		this.dragon = dragon;
	}

	public void config()
	{
		System.out.println("octa core ,4 gb ram, 12mp camara");
		dragon.process();
	}

}
