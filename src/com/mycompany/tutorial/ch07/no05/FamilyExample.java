package com.mycompany.tutorial.ch07.no05;

import java.util.Arrays;

public class FamilyExample {

	public static void main(String[] args) {

		int[] arr = { 40, 5, 10};
		int momResult;
		int sonResult;
		
		Mom mom = new Mom();
		
		System.out.println(Arrays.toString(arr));
		
		mom.orderArray(arr);
		System.out.println("정렬 메소드 실행");
		
		System.out.println(Arrays.toString(arr));
		
		momResult = mom.myMath(arr);
		System.out.printf("부모클래스 메서드 : %d\n",momResult);

		Son son = new Son();
		
		sonResult = son.myMath(arr);
		System.out.printf("자식클래스 메서드 : %d\n",sonResult);
		
		System.out.printf("부모 : %3d  |  자식 : %3d\n",momResult,sonResult);
	}

}
