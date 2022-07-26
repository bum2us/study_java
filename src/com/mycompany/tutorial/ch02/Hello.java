package com.mycompany.tutorial.ch02;

import java.util.Iterator;

public class Hello {
	
	public static void main(String[] args) {
		
		
		//제목
		String title = "sunset in vietnam city";
		//내용
		String content = "내용이 너무 많아서 쓰기 힘들어요";
		//작성자
		String writer = "무명의 작가";
		//태그
		String[] tags = {"도시","베트남","노을","석양이진다"};
		//조회수
		int hit;
		//좋아요수
		int like;
		
		System.out.println("제목 : " + title);
		
		System.out.println("사용자 지정 태그");		
		
		for (int i = 0; i < tags.length; i++) {
			System.out.println("▶ #"+tags[i]);
		}
		
	}

}
