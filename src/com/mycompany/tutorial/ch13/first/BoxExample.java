package com.mycompany.tutorial.ch13.first;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<String> boxString = new Box<String>();
		
		boxString.set("신범수");
		System.out.println(boxString.get());
		boxString.out();
		
		Box<Integer> box2 = new Box<Integer>();
		// t : Integer t;
		box2.set(11);
		int number = box2.get();
		System.out.println("number: " + number);
		
		Box<Double> box3 = new Box<Double>();
		box3.set(3.0); // set으로 데이터를 받아서
		Double number2 = box3.get(); // get 으로 사용하겠다.
		System.out.println("number : "+ number2);
	}

}
