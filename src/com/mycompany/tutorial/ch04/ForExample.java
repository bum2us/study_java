package com.mycompany.tutorial.ch04;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5; i++) {
			System.out.println("**********");
		}
		
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			if(5 % i == 0)
				System.out.println("**********");
			else
				System.out.println("*        *");
		}
		
		String s2 = "";
		
		for (int i = 1; i <= 10; i++) {
			
			String s = "";
			
			for (int j = 1; j < i; j++) {
				s += j;
			}
			
			System.out.println(s);
			
			if(i % 2 != 0)
				s2 += i;
			else if(i == 10)
				s2 += 0;
			else
				s2 += " ";
		}
		System.out.println(s2);
	}

}
