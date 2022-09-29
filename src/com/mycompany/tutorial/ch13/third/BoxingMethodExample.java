package com.mycompany.tutorial.ch13.third;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<Integer> box = Util.boxing(99);
		int rtInt = box.get();
		
		System.out.println("rtInt : " + rtInt);
		
		Box<String> bbox = Util.boxing("신범수");
		
		System.out.println(bbox.get());
	}

}
