package com.mycompany.tutorial.ch05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myLotto = new int[6];
		
		Random rnd = new Random();
		
		while(true) {
			
			for (int i = 0; i < myLotto.length; i++) {
				myLotto[i] = rnd.nextInt(45);
			}
			
			if(checkOverlab(myLotto))
				continue;
			
			Arrays.sort(myLotto);
			
			if(checkSeq(myLotto,0) && checkHistory(myLotto))
				break;
		}
		
		System.out.printf("[%d][%d][%d][%d][%d][%d]",myLotto[0],myLotto[1],myLotto[2],myLotto[3],myLotto[4],myLotto[5]);
	}

	private static boolean checkHistory(int[] myLotto) {
		
		String myLot = "";
		
		for (int i : myLotto) {
			myLot += i;
		}
		
		try {
			File historyFile = new File("D:\\\\01_DEV\\\\wsEzen\\\\study_java\\\\lottoHistory.txt");
			Scanner scan = new Scanner(historyFile);
			while(scan.hasNextLine()) {
				if(myLot.equals(scan.nextLine()))
					return false;
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("에러");
		}
		
		

		return true;
	}

	private static boolean checkSeq(int[] myLotto , int start){
		// 3개의 수가 연속으로 나오는지 체크
		
		if(start + 2 > 5) return true;
		
		if( (myLotto[start+2]-myLotto[start+1] == 1) && (myLotto[start+1]-myLotto[start] == 1) )
			return false;
		else
			return checkSeq(myLotto,start+1);
	}

	private static boolean checkOverlab(int[] myLotto) {
		// 하나라도 같은 번호가 있으면 새롭게 번호 추출해야합니다.
		for (int i = 0; i < myLotto.length; i++) {
			for (int j = i+1; j < myLotto.length; j++) {
				if(myLotto[i] == myLotto[j]) return true;
			}
		}
		
		return false;
	}

	/*
	private static void sortNo(int[] myLotto) {
		// 배열속 번호를 오름차순으로 정렬합니다.
		int temp = 0;
		
		for (int i = 0; i < myLotto.length; i++) {
		
			for (int j = 0; j < myLotto.length-1; j++) {
				
				if(myLotto[j] > myLotto[j+1]) {
					temp = myLotto[j+1];
					myLotto[j+1] = myLotto[j];
					myLotto[j] = temp;
				}
			}
			
		}
		
	}
	*/
}
