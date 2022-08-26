package com.mycompany.tutorial.ch07.no04;

public class AirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asiana asiana = new Asiana();
		
		asiana.takeOff();
		asiana.fly();
		asiana.flyMode = asiana.SUPERSONIC;
		asiana.fly();
		asiana.flyMode = asiana.NOMAL;
		asiana.fly();
		asiana.land();
	}

}
