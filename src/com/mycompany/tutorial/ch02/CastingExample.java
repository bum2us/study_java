package com.mycompany.tutorial.ch02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double doubleValue = 123456;
		System.out.println(doubleValue);
		
		double doubleValue2 = 1234567891; // 7자리 이상은 e로 표현됨
		System.err.println(doubleValue2);
		
		//double -> float
		float floatValue = (float)doubleValue;
		System.out.println(floatValue);
		
		//float -> long
		long longValue = (long)floatValue;
		System.out.println(longValue);
		
		//long -> int
		int intValue = (int)longValue;
		System.out.println(intValue);
		
		//int -> short
		short shortValue = (short)intValue;
		System.out.println(shortValue);
		
		//short -> byte
		byte byteValue = (byte)shortValue;
		System.out.println(byteValue);
		
		String stringValue ="98989";
		int intValue2 = 12345;
		
		intValue2 = Integer.parseInt(stringValue);
		stringValue = String.valueOf(intValue);
		
		System.out.println(intValue2);
		System.out.println(stringValue);
		
	
	}

}
