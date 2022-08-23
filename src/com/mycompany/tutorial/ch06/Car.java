package com.mycompany.tutorial.ch06;

public class Car {
	
	String name;
	String color;
	int cc;
	
	Car()
	{
		
	}
	
	Car(String name)
	{
		this.name = name;
	}
	
	Car(String name, int cc)
	{
		this.name = name;
		this.cc = cc;
	}
	
	Car(String name, String color, int cc)
	{
		this.name = name;
		this.color = color;
		this.cc = cc;
	}
	
	
}
