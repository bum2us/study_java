package com.mycompany.tutorial.myStudy;


import static java.lang.Math.random;
import static java.lang.System.out;

public class tutorial_staticImport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//기존에 사용할 때에는 Math.random() 으로 앞에 Math라는 클래스가 붙습니다.
		int num = (int)(random() * 10);
		//위 처럼 Math라는 클래스를 생략할 수 있습니다.
		
		//System. 이 생략된 모습 입니다.
		out.println("생성된 난수 : " + num);
	}

}
