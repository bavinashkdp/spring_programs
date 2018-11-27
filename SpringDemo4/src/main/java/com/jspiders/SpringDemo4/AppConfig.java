package com.jspiders.SpringDemo4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.jspiders.SpringDemo4")
public class AppConfig
{
@Bean
public Samsung getSamsung()
{
   return new Samsung();	 
}
@Bean
public SnapDragon getSnapDragon()
{
	return new SnapDragon();
}
}
