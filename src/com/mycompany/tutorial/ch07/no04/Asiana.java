package com.mycompany.tutorial.ch07.no04;

public class Asiana extends Airplane{
	
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NOMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC)
			System.out.println("빠른비행");
		else
			super.fly();
	}
	
	
}
