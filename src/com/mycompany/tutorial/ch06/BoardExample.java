package com.mycompany.tutorial.ch06;

public class BoardExample {

	public static void main(String[] args) {

		Board board1 = new Board();
		Board board2 = new Board("공지사항");
		Board board3 = new Board("자유게시판",333);
		Board board4 = new Board("판매게시판",true);
		Board board5 = new Board("구매게시판",555,false);
		
		board1.title = "일반게시판";
		board1.hit = 111;
		board1.useNy = true;
		
		board2.hit = 222;
		board2.useNy = false;
		
		board3.useNy = true;
		
		board4.hit = 444;
		
		board1.myPrint();
		board2.myPrint();
		board3.myPrint();
		board4.myPrint();
		board5.myPrint();

	}

}
