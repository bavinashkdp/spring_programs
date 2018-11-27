package com.jspiders.SpringDemo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
    	Samsung samsung=applicationContext.getBean(Samsung.class);
    	samsung.config();
    }
}
