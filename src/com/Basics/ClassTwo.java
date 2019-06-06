package com.Basics;

public class ClassTwo extends ClassThree{
	
	
	@Override
	public void printMessage(String x,int y) {
		System.out.println(x);
		System.out.println(super.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassTwo c=new ClassTwo();
		c.printMessage("Good Day",10);	
	
	}

}

class ClassThree extends BaseClass{
	
	int age=10;
	protected void printMessage(String x,int y) {
		
	}
	
}


class BaseClass{
	
}