package com.mycompany.tutorial.ch07.no05;

public abstract class Phone {
	
	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() { System.out.printf("%s가 폰 전원을 켭니다.\n",this.owner); }
	public void turnOff() { System.out.printf("폰 전원을 끕니다\n"); }
}
