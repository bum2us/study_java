package com.mycompany.tutorial.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 65;
		
		boolean result1 = (a >= 65);
		System.out.println("result : " + result1);
	
		boolean result2 = (a <= 90);
		System.out.println("result : " + result2);
		
		if(a >= 65 & a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		if(a >= 65 && a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
	
		System.out.println("----------------------------------------");
		
		if(a >= 65 | a <=90) {
			System.out.println("둘다참");
		}
		
		if(a >= 66 | a <= 90) {
			System.out.println("한개만 참");
		}
		
		if(a >= 66 | a <= 50) {
			System.out.println("둘다 폴스라서 이 글은 보이지 않아야 되는데 말이지...");
		}
		
		if(a >= 65 || a <=90) {
			System.out.println("둘다참");
		}
		
		if(a >= 66 || a <= 90) {
			System.out.println("한개만 참");
		}
		
		if(a >= 66 || a <= 50) {
			System.out.println("둘다 폴스라서 이 글은 보이지 않아야 되는데 말이지...");
		}
	
		System.out.println("----------------------------------------");
		
		// ^ 베타적 논리합 같으면 false 다르면 true
		
		if(a >= 65 ^ a <= 50) {
			System.out.println("이렇게 해야 보여진다.");
		}
		
		if(a == 65 ^ a <= 50) {
			System.out.println("111");
		}
		
		if(a != 65 ^ a <= 50) {
			System.out.println("111");
		}
	}

}
