package com.mycompany.tutorial.ch07.first;

public class CellPhone {
	
	String model;
	String color;					  //인스턴스 변수
	static String madeCompany = "LG"; //클래스 변수
	
	void powerOn() { System.out.println("전원을 켭니다"); }
	void powerOff() { System.out.println("전원을 끕니다"); }
	void bell() { System.out.println("벨이 울어"); }
	void sendVoice(String message) { System.out.println("자기: " + message); }
	void receiveVoice(String message) { System.out.println("상대방: " + message); }
	void hangUp() { System.out.println("전화를 끊습니다"); }
}
