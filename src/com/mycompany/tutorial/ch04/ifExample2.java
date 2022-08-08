package com.mycompany.tutorial.ch04;

public class ifExample2 {
	public static void main(String[] argsv) {
		
		int price = 30000;
		String rating = "platinum";
		
		if(rating == "basic") {
			myDiscount(price,5);
		}else if(rating == "blonze") {
			myDiscount(price,10);
		}else if(rating == "silver") {
			myDiscount(price,15);
		}else if(rating == "gold") {
			myDiscount(price,20);
		}else if(rating == "platinum") {
			myDiscount(price,2.7);
		}
		
	}
	
	static void myDiscount(int price, double disc) {
		
		double salePrice =  price - price * (disc/100);
		System.out.println("원가 : " + price + " 할인가 : " + salePrice);
	}
}
