package com.mycompany.tutorial.ch06;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("신범수","950520-1111111");
		System.out.println("name : " + k1.name);
		System.out.println("ssn : " + k1.ssn);
		
		Korean k2 = new Korean("홍길동",45);
		System.out.println("name : " + k2.name);
		System.out.println("ssn : " + k2.age);
	}
}
