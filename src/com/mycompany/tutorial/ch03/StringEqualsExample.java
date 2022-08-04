package com.mycompany.tutorial.ch03;

public class StringEqualsExample {
	public static void main(String[] args) {
		
		
		String str1 ="신범수";
		String str2 ="신범수";
		String str3 = new String("신범수");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}
}
