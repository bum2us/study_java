package com.mycompany.tutorial.ch07.no05;

public class Son extends Mom {
	
	int sum;
	
	Son() {
		super();
	}
	
	@Override
    int myMath(int[] arr) {
    	
    	sum = arr[0] * arr[1] + arr[2] + 10;
    	
    	return sum;
    }
}
