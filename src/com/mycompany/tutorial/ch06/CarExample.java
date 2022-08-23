package com.mycompany.tutorial.ch06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car casper = new Car("캐스퍼");
		
		Car sm5 = new Car("sm5" , 2000);
		
		Car bmw = new Car("bmw" , "white", 3000);
		
		System.out.println(casper.name);
		System.out.println(sm5.name + " " + sm5.cc);
		System.out.println(bmw.name + " " + bmw.color + " " + bmw.cc);
	}

}
