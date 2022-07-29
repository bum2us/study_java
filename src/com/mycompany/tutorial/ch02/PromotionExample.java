package com.mycompany.tutorial.ch02;

public class PromotionExample {
 public static void main(String[] args) {
	 
	 //작은 형이 큰형으로  변환은 문제가 되지 않는다.
	 //byte < short < int < long < float < double
	 
	 byte bytevalue = 10;
	 
	 int intvalue = bytevalue;
	 
	 System.out.println(intvalue);
	 
	 int intValue2 = 1230;
	 double doubleValue = intValue2;
	 
	 System.out.println(doubleValue);
 }
}
