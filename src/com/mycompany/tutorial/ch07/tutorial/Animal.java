package com.mycompany.tutorial.ch07.tutorial;

public class Animal {
	
	String name;
	String gender;
	
	
	public Animal() {
		
	}
	
	public Animal(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	void Eat() { System.out.println(name + " : 먹이를 먹습니다."); }
	void Sleep(int t) {System.out.printf(name + " : %d시간 동안 잠을 잔다.\n",t);}
	void Dead() { System.out.println(name+" : 죽었습니다."); }
	void Cry(String s) { System.out.println(name + " : " +s); }  
}
