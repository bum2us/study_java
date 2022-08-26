package com.mycompany.tutorial.ch07.no01;

public class DMbCellPhoneExample {

	public static void main(String[] args) {

		 DmbCellPhone dmbCellPhone = new DmbCellPhone();
		 
		 dmbCellPhone.powerOff();
		 dmbCellPhone.bell();
		 dmbCellPhone.showCompany();

		 DmbCellPhone dmbCellPhone2 = new DmbCellPhone("가로본능","블랙",7);
		 
		 dmbCellPhone2.turnOnDmb();
		 dmbCellPhone2.showCompany();
		 
		 dmbCellPhone2.madeCompany = "samsung";
		 
		 dmbCellPhone.showCompany();
		 dmbCellPhone2.showCompany();
		 
		 DmbCellPhone.madeCompany = "APPLE";

		 dmbCellPhone.showCompany();
		 dmbCellPhone2.showCompany();
	}

}
