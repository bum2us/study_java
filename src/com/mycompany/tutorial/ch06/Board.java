package com.mycompany.tutorial.ch06;

public class Board {
	
	String title;
	int hit;
	boolean useNy;
	
	Board() {
		
	}
	
	Board(String title){
		this.title = title;
	}
	
	Board(String title, int hit) {
		this.title = title;
		this.hit = hit;
	}

	Board(String title, boolean useNy) {
		this.title = title;
		this.useNy = useNy;
	}

	Board(String title, int hit, boolean useNy) {
		this.title = title;
		this.hit = hit;
		this.useNy = useNy;
	}
	
	public void myPrint() {
		System.out.println("이름 : " + title);
		System.out.println("조회수 : " + hit);
		System.out.println("사용여부 : " + useNy);
		System.out.println("-----------------");
	}
	
}
