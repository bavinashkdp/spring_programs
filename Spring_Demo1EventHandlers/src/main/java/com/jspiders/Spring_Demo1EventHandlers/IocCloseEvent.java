package com.jspiders.Spring_Demo1EventHandlers;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class IocCloseEvent implements ApplicationListener<ContextClosedEvent> {

	public void onApplicationEvent(ContextClosedEvent arg0) 
	{
		System.out.println("on close mothod ContextClosedEvent");
	}

}
