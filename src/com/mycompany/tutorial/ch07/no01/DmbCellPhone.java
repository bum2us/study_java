package com.mycompany.tutorial.ch07.no01;

public class DmbCellPhone extends CellPhone{
	
	int channel;
	
	public DmbCellPhone() {
		
	}

	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println(this.channel+"채널 DMB 방송 수신을 시작합니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB를 종료합니다");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println(this.channel + "번 으로 채널을 바꿉니다.");				
	}
	
	void bell() {
		System.out.println("bbbbbbbbbbbbbbbbbbbbb");
	}
	
	void showCompany() {
		System.out.println(this.madeCompany);
	}
}
