package com.mycompany.tutorial.ch07.no02;

public class Student extends People{

		public int studentNo;

		public Student(String name, String ssn,int studentNo) {
			super(name,ssn);
			this.studentNo = studentNo;
			System.out.printf("이름 : %s\nssn : %s\nno : %d\n",name,ssn,studentNo);
		}
		
		public Student(String name, String ssn) {
			super(name,ssn);
			System.out.printf("이름 : %s\nssn : %s\nno : %d\n",name,ssn,studentNo);
		}

		public Student() {
			super();
		}
		
		public void showInfo() { System.out.printf("이름 : %s\nssn : %s\nno : %d\n",name,ssn,studentNo); }
}
