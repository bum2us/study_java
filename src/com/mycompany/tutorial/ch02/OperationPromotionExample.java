package com.mycompany.tutorial.ch02;

public class OperationPromotionExample {
	public static void main(String[] args) {
		
		byte byteValue = 12;
		byte byteValue2 =12;
		byte byteValue3 = (byte) (byteValue + byteValue2);
		System.out.println(byteValue3);
		
		short shortValue = 12;
		short shortValue2 = 12;
		short shortValue3 = (short)(shortValue + shortValue2);
		System.out.println(shortValue3);
		
		int intValue = 12;
		int intValue2 = 12;
		int intValue3 = intValue + intValue2;
		System.out.println(intValue3);
		
		long longValue = 12;
		long longValue2 = 12;
		long longValue3 = longValue + longValue2;
		System.out.println(longValue3);
		
		float floatValue = 12.0f;
		float floatValue2 = 12.0f;
		float floatValue3 = floatValue + floatValue2;
		System.out.println(floatValue3);
		
		double doubleValue = 12.0;
		double doubleValue2 = 12.0;
		double doubleValue3 = doubleValue + doubleValue2;
		System.out.println(doubleValue3);
		
		
		byte byteValue4 = (byte)(intValue + byteValue);
		int intValue4 = intValue + byteValue;;
		System.out.println(byteValue4);
		System.out.println(intValue4);
		
		int intValue5 = (int)(intValue + doubleValue);
		double doubleValue4 = intValue + doubleValue;
		System.out.println(intValue5);
		System.out.println(doubleValue4);
	}
}
