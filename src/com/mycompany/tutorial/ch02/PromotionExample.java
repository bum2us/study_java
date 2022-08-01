package com.mycompany.tutorial.ch02;

public class PromotionExample {
 public static void main(String[] args) {
	 
	 //작은 형이 큰형으로  변환은 문제가 되지 않는다.
	 //byte < short < int < long < float < double
	 
	 byte mybyte = 1;
	 short myshort = 2;
	 int myint = 3;
	 long mylong = 4;
	 float myfloat = 5.0f;
	 double mydouble = 6.0;
	 
	 
	 myint = myshort;	 
	 System.out.println(myint);
	 
	 mylong = myint;
	 System.out.println(mylong);
	 
	 myfloat = mylong;
	 System.out.println(myfloat);
	 
	 mydouble = myfloat;
	 System.out.println(mydouble);
	 
	 myint = 99;
	 myshort = (short)myint;
	 System.out.println(myshort);
 }
}

