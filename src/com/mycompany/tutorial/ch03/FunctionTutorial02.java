package com.mycompany.tutorial.ch03;

public class FunctionTutorial02 {
	public static void main(String[] args) {	
		
		myAvg("홍길동",60,70,85,90,45);
		myAvg("박말순",50,75,50,60,70);
		myAvg("고장난",55,60,64,58,90);
		myAvg("도롱뇽",80,70,63,88,78);
				
	}
	
	static void myAvg(String n,int a,int b, int c, int d, int e) {
		System.out.println(n+" : "+mySum(a,b,c,d,e)/5);
	}
	
	static double mySum(int a,int b,int c, int d, int e) {
		return a+b+c+d+e;
	}
	
}




























/*
	public static void main(String[] args) {
		
		myAvg(60,70,85,90,45);
	}
	static void myAvg(int a,int b, int c, int d, int e) {
		
		int[] scores = {a,b,c,d,e};
		
		System.out.println(mySum(a,b,c,d,e)/scores.length);
	}
	
	static int mySum(int[] s){
		
		int sum = 0;
		
		for(i=0;i<s.Length;i++){
			sum += s[i];
		}
		
		return sum;
	}
}
 */