package com.mycompany.tutorial.ch02;

public class CharExample {
	public static void main(String[] args) {
		
		//자바는 모든 문자를 유니코드로 처리함
		// 	    'A' = 문자를 저장
		//       65 = 십진수로 저장
		// '\u0041' = 16진수로 저장
		
		char[] charGroup = {'A',65,'\u0041','가',44032,44033,44034,'\uac00'};
		
		for (int i = 0; i < charGroup.length; i++) {
			System.out.println(charGroup[i]);
		}
		
		int unicode = charGroup[0];
		System.out.println(unicode);
	}
}
