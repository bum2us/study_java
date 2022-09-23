package com.mycompany.tutorial.exam;

public class Television implements RemoteControl{

	int volume;
	
	@Override
	public void turnon() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setvolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME)
			this.volume = 10;
		else if(volume < RemoteControl.MAX_VOLUME)
			this.volume = 0;
		
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}
