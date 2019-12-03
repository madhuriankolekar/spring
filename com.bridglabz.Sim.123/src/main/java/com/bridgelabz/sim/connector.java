package com.bridgelabz.sim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdk.nashorn.internal.runtime.Context;

///mport org.springframework.context.ApplicationContext;
public class connector {
	public static void main(String[] args) {
		///Sim obj=new Airtel();
		///obj.contact();
		ApplicationContext contex=new AnnotationConfigApplicationContext();
		Idea m= contex.getBeans(Idea.class);
	}

}
