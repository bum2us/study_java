package com.mycompany.tutorial.ch07.tutorial;

public class Dog extends Animal{
	
	String name;
	int leg;
	
	Dog() {
		
	}
	
	Dog(String name, String gender,int leg) {
		super(name,gender);
		this.leg = leg;
	}
	
	void Run() { System.out.println(name + " : " + "달립니다."); }
	void showLeg() { System.out.println(name + " : " + this.leg + "개의 다리를 가졌네요"); } 
	void Info() { System.out.printf("[%s][%s][%s]\n",((Biology)this).name,super.name ,name ); }
}
