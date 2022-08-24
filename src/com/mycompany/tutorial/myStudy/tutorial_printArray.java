package com.mycompany.tutorial.myStudy;

import java.util.Arrays;

public class tutorial_printArray {

	public static void main(String[] args) {

		int[] iarr = { 1 , 5 , 15 , 25 , 35 , 45 };
		
		//기존의 배열 요소 전체 출력
		for (int i = 0; i < iarr.length; i++) {
			System.out.println(iarr[i]);
		}

		//Arrays.toString(배열이름) 을 이용한 배열 요소 출력
		System.out.println(Arrays.toString(iarr));
	}

}
