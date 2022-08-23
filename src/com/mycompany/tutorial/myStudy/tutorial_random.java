package com.mycompany.tutorial.myStudy;

public class tutorial_random {

	public static void main(String[] args) {
		
		// Math.random() 사용시 0.0 ~ 1.0 의 난수 생성
		System.out.println(Math.random()); //0.0 <= random < 1.0
		
		//1 ~ 10 사이의 난수 구하는 법
		System.out.println(Math.random() * 10);  //0.0 <= random < 10.0
		
		//아래 형변환을 통해 소수점 아래자리를 제거
		//형변환 전에 Math.random() * 10 을 괄호로 감싸야 한다
		System.out.println((int)(Math.random()*10)); //0 <= random < 10
		
		System.out.println((int)(Math.random()*10) + 1); //1 <= random < 11
		
		// -5 , -4 , -3 , -2 , -1 , 0 , 1 , 2 , 3 , 4 , 5
		System.out.println((int)(Math.random()*10) - 5); //-5 <= random < 6
	}

}
