package com.mycompany.tutorial.myStudy;

public class tutorial_class_card {
	
	String mark;
	String no;
	static int width = 200;
	static int height = 400;
	
	public tutorial_class_card() {
		
	}
	
	public tutorial_class_card(String mark, String no) {
		this.mark = mark;
		this.no = no;
	}
	
	void showCard() {
		System.out.println(this.mark + this.no + " " + height +"X"+width);
	}
	
}
