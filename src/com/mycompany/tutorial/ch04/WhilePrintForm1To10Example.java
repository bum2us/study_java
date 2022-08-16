package com.mycompany.tutorial.ch04;

public class WhilePrintForm1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int sum = 0;
		
		while(i <= 10) {
			System.out.println(i + " : " + (sum+=i));	
			i++;
		}
	}

}
