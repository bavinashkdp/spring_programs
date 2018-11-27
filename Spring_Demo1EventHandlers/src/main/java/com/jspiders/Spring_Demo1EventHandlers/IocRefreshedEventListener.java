package com.jspiders.Spring_Demo1EventHandlers;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class IocRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

	public void onApplicationEvent(ContextRefreshedEvent arg0) 
	{
		System.out.println("on refresh method ContextRefreshedEvent while loading the spring.xml by ioc container");
	}

}
