package com.bridgelabz.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.ioc.service.Sim;
import com.bridgelabz.ioc.service.Vodaphone;

public class Controller{
	
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");//beans->xml filename
		Sim sim=(Vodaphone) context.getBean("vodafone");
		//Sim sim1= (Idea) context.getBean("Idea");
		//Sim sim1=(Vodaphone) context.getBean("");
		sim.contact();
		//sim.call();
		////sim1.call();
	}

	
}
