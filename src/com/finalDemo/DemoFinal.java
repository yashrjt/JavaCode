package com.finalDemo;

public  class DemoFinal {

	final int BONUS=1000;
	int salary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoFinal d=new DemoFinal();
//		d.BONUS=2000;
		System.out.println(d.BONUS);
		
	}
	
	final void displaySalary() {
		System.out.println("Display salary message");
	}
	
}
