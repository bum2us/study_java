package com.mycompany.tutorial.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {
		
		Arithmetic myArith = new Arithmetic();
		
		myArith.myPrint(myArith.plus(3, 4));
		myArith.myPrint(myArith.minus(6, 3));
		myArith.myPrint(myArith.multi(9, 9));
		myArith.myPrint(myArith.div(10, 5));
		myArith.myPrint(myArith.remind("비대면", "좋아"));
	}

}
