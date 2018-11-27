package com.jspiders.Spring_Demo1EventHandlers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class IocStopEventListener  implements ApplicationListener<ContextStoppedEvent>
{

	public void onApplicationEvent(ContextStoppedEvent arg0) 
	{
		System.out.println("on stop method in ContextStoppedEvent");
		
	}
	

}
