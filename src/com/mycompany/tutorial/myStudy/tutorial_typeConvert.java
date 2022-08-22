package com.mycompany.tutorial.myStudy;

public class tutorial_typeConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dob = "950520";

		System.out.println('3' - '0');      //문자에서 문자0 을 빼면 숫자가 된다
		System.out.println('3' - '0' + 1);  //앞의 문자 3이 숫자로 변하여 1이 더하진 4가 나온다
		System.out.println(3 + "");         //숫자 3에 빈문자열을 더해서 문자 3이 된다
		System.out.println(3 + "바로 문자를 더하기도 합니다.");   
		System.out.println(Integer.parseInt("3") + 1); //문자 3을 숫자로 변환 1과 더하여 4가 나옴
		System.out.println(dob.charAt(1));  //"950520" 에서 0번째가 아닌 1번째의 문자 5가 추출
		
	}

}
