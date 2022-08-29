package com.mycompany.tutorial.ch07.no05;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone smPhone = new SmartPhone("신범수");
		
		smPhone.internetSearch();
		smPhone.turnOff();
		smPhone.turnOn();
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
	}

}
