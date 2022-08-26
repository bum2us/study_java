package com.mycompany.tutorial.ch07.no03;

public class ComputerExample {

	public static void main(String[] args) {

		int r = 10;
		Calculator c = new Calculator();
		
		System.out.println(c.areaCircle(r));
		
		Computer com = new Computer();
		
		System.out.println(com.areaCircle(r));
		
	}

}
