package com.mycompany.tutorial.myStudy;

public class tutorial_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 28;
		int dobMonth = 5;
		int dobDay = 20;
		
		System.out.printf("범수는 %d세이며 생일이 %d월 %d일 입니다.\n", age, dobMonth, dobDay);
		
		System.out.printf("범수는 [%5d]세이며\n생일이 [%-5d]월 [%05d]일 입니다.\n", age, dobMonth, dobDay);
		
		System.out.printf("소수점을 표현해볼게요 %f\n", 1.23456789);
		System.out.printf("소수점을 표현해볼게요 %14.10f\n", 1.23456789);
	}

}
