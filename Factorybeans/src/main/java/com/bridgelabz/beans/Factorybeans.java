package com.bridgelabz.beans;

public class Factorybeans {
	private int id;  
	private String name;  
	  
	public Factorybeans() {System.out.println("def cons");}  
	  
	public Factorybeans(int id) {this.id = id;}  
	  
	public Factorybeans(String name) {  this.name = name;}  
	  
	public Factorybeans(int id, String name) {  
	    this.id = id;  
	    this.name = name;  
	}  
	  
	void show(){  
	    System.out.println(id+" "+name);  
	}  
	  
	}  


