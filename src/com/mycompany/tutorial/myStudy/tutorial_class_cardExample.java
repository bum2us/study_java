package com.mycompany.tutorial.myStudy;

public class tutorial_class_cardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		tutorial_class_card card1 = new tutorial_class_card("하트","9");
		
		card1.showCard();
		
		tutorial_class_card.height = 600;
		tutorial_class_card.width = 300;
		
		tutorial_class_card card2 = new tutorial_class_card("다이아", "K");
		
		card1.showCard();
		card2.showCard();
	}

}
