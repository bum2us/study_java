package com.mycompany.tutorial.exam;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television tv = new Television();
		
	    //int volume = 100;
		int volume = -10;
		
		tv.turnon();
		tv.setmute(true);
		tv.setmute(false);
		tv.setvolume(volume);
		RemoteControl.changeBattery();
		tv.turnoff(); 
	}
}
