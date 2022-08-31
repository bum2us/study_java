package com.mycompany.tutorial.myStudy;

public class Car {
	
	String name;
	String company;
	String color;
	
	public Car() {
		
	}
	
	
	public Car(String name, String company, String color) {
		this.name = name;
		this.company = company;
		this.color = color;
	}

	public void showInfo() {
		System.out.println("----------------\n이름: " + name + "\n제조사: " + company + "\n컬러: " + color);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름: " + name + "\n제조사: " + company + "\n컬러: " + color; 
	}
}
