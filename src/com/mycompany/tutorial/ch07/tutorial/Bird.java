package com.mycompany.tutorial.ch07.tutorial;

public class Bird extends Animal {
	
	boolean IsFly;

	public Bird() {
		
	}
	
	public Bird(String name, String gender, boolean isFly) {
		super(name,gender);
		this.IsFly = isFly;
	}
	
	void Fly() { 
		String txt = IsFly ? "하늘을 날고있습니다." :"하늘을 날지 못해요"; 
		System.out.println(name + " : " + txt);
		}
	
	void createEgg() { System.out.println(name+" : 알을 낳았어요"); }
	
}
