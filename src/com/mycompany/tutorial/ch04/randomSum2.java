package com.mycompany.tutorial.ch04;
import java.util.*;

public class randomSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		
		int min = rd.nextInt(100);
		int max = rd.nextInt(100);
		int tmp = min;
		
		if(min > max) {
			tmp = max;
			max = min;
			min = tmp;
		}
		
		tmp = 0;
		
		for (int i = min; i <= max; i++) {
			tmp += i;
		}
		
		System.out.println(min + " ~ " + max + " = " + tmp);
	}

}
