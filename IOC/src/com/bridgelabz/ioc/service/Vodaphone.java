package com.bridgelabz.ioc.service;            

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("vodafone")
public class Vodaphone implements Sim{
	

	@Override
	public void contact() {
		System.out.println("I am Vodaphone");
		
	}
	public void call()
	{
		System.out.println("i  am using VODAPHONE sim");
	}

	

}
