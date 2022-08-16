package com.mycompany.tutorial.ch04;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int sum = 0;
		
		do {
			System.out.println( i + " : " + sum);
			
			sum += i;
			i++;
			
		} while (i <= 10);
	}

}
