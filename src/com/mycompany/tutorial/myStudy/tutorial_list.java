package com.mycompany.tutorial.myStudy;

import java.util.ArrayList;
import java.util.List;

public class tutorial_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car("타요","EBS","파랑");		
		car.showInfo();
		
		Car car1 = new Car("아이오닉5","현대","회색");
		Car car2 = new Car("sm3","현대","노랑");
		Car car3 = new Car("sm5","현대","파랑");
		Car car4 = new Car("제네시스","현대","흰색");
		Car car5 = new Car("그랜저","현대","검정");
		
		
		List<Car> listCar = new ArrayList<Car>();
		
		listCar.add(car1);
		listCar.add(car2);
		listCar.add(car3);
		listCar.add(car4);
		listCar.add(car5);
		
		for (int i = 0; i < listCar.size(); i++) {
			listCar.get(i).showInfo();
		}
	}

}
