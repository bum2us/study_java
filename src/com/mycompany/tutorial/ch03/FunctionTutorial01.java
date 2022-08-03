package com.mycompany.tutorial.ch03;

public class FunctionTutorial01 {
	public static void main(String[] args) {
		
		double result;
		double result2;
		
		result = myDif(myDiv(5.0,3.0),myDiv(5.0,8.0));
		result = myPro(result,myDiv(49.0,5.0));
		
		System.out.println("1번 문제");
		System.out.println(result);
		
		result2 = myDif(3.25,myDiv(11.0,6.0));
		result2 = myPro(result2,myDiv(12.0,17.0));
		result2 = myDif(5.0,result2);
		
		System.out.println("2번 문제");
		System.out.println(result2);
		
		mySum(8,7,5);
		mySum(1,9,5);
		mySum(5,6,6);
		mySum(4,7,1);
		mySum(7,5,5);
		
	}
	static double myDiv(double a,double b) {
		return a/b;
	}
	static double myPro(double a,double b) {
		return a*b;
	}
	static double myDif(double a,double b) {
		return a-b;
	}
	static double mySum(double a, double b) {
		return a+b;
	}
	static void mySum(int a,int b,int c) {
		System.out.println(a+" + "+b+" + "+c+" = " + (a+b+c));
	}
}

