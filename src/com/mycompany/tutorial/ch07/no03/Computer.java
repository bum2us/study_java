package com.mycompany.tutorial.ch07.no03;

public class Computer extends Calculator {

	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI * r * r;
	}
	
}