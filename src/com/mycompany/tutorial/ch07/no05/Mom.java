package com.mycompany.tutorial.ch07.no05;

import java.util.Arrays;

public class Mom {
    
    int sum;

    Mom() {
    	
    }
    
    void orderArray (int[] arr){
        Arrays.sort(arr);
    }
    
    int myMath(int[] arr) {
    	
    	sum = arr[0] * arr[1] + arr[2];
    	
    	return sum;
    }
}
