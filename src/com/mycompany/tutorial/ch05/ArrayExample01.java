package com.mycompany.tutorial.ch05;

public class ArrayExample01 {
	public static void main(String[] args) {
		
		int[] scoreArray = {66,77,88,99,67};
		double result = 0;
		
		for (int i = 0; i < scoreArray.length; i++) {
			System.out.println(scoreArray[i]);
			result += scoreArray[i];
		}
		
		System.out.println(result/scoreArray.length);
		
	}
}
