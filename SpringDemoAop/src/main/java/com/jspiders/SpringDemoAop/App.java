package com.jspiders.SpringDemoAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
       Alien alien=(Alien) applicationContext.getBean("alien");
      alien.show(); 
   //   Helper helper=(Helper) applicationContext.getBean("helper");
     // helper.log();
    }
}
