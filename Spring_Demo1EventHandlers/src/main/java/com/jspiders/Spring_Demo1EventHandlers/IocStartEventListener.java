package com.jspiders.Spring_Demo1EventHandlers;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class IocStartEventListener implements ApplicationListener<ContextStartedEvent> 
{

	public void onApplicationEvent(ContextStartedEvent arg0) 
	{
		System.out.println("on start method");
		
	}

}
