package com.mycompany.tutorial.ch02;

public class ByteExample {
	public static void main(String[] args) {
		
		byte[] bytes = {-128,-30,0,30,127};
		
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		System.out.println("byte는 -128 ~ 127 까지 입니다.");
	}
}
