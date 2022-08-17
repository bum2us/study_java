package com.mycompany.tutorial.ch05;

public class ArrayExample02 {
	public static void main(String[] args) {
		
		int[] arr1 = new int[5];
		
		
		arr1[0] = 77;
		arr1[1] = 88;
		arr1[2] = 99;
		arr1[3] = 66;
		arr1[4] = 67;
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
