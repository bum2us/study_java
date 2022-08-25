package com.mycompany.tutorial.ch07.tutorial;

public class Zoo {

	public static void main(String[] args) {
		
		Bird birdA = new Bird("참새","수컷",true);
		Bird birdB = new Bird("닭","암컷",false);
		
		birdA.Cry("짹짹짹");
		birdB.createEgg();
		birdB.Cry("꼬끼오~꼬꼬꼬끼오~!");
		
		
		Dog dogA = new Dog("푸들","수컷",4);
		Dog dogB = new Dog("포메라니안","암컷",4);
		Dog dogC = new Dog("불독","수컷",4);
		
		dogA.Run();
		dogB.Eat();
		dogB.Sleep(3);
		dogC.showLeg();
		dogA.Dead();
	}

}
