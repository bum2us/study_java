package com.mycompany.tutorial.ch06;

public class Korean {

	String name;
	String ssn;
	int age;
	
	Korean() 
	{
		
	}
	
	Korean(String name, String ssn)
	{
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	static String nationality = "대한민국";
	
	static int statictest(int a) {
		return a + 10;
	}
}
