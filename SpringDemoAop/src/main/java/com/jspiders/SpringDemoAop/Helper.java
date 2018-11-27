package com.jspiders.SpringDemoAop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper 
{
//	@Before()
	@Before("execution(public void show())")
	public void log()
	{
		System.out.println("log method is called");
	}

}
