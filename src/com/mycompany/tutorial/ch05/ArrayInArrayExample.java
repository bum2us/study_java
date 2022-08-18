package com.mycompany.tutorial.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrName = {"신범수" , "장동건" , "고소영" , "장원영" , "홍길동"};
		int[][] arrScore = {{54,99,34},{21,56,99},{99,12,67},{78,43,99},{99,43,21}};
		
		String[] arrTitle = {"국어","영어","수학"};
		double[] arrAvg = new double[3];
		
		for (int i = 0; i < arrName.length; i++) {
			
			double avg = 0;

			System.out.println(arrName[i] + " 평균");
			
			for (int j = 0; j < arrScore[i].length; j++) {
				//개인의 평균 점수 담기
				avg += arrScore[i][j];
				
				//과목별 평균 점수 담기
				arrAvg[j] += arrScore[i][j];
			}
			
			System.out.println(avg/5);
		}
		
		for (int i = 0; i < arrAvg.length; i++) {
			System.out.println(arrTitle[i] + " 평군 : " + arrAvg[i]/5);
		}
		
	}

}
