package com.Basics;

public class ClassOne {

	
	static int x=10;
	static int y;
//	static {
//		y=20;
//		System.out.println("Static block 1 called");
//	}
//	static {
//		y=20;
//		System.out.println("Static block 2 called");
//	}
//	
	 void printMessage() {		
		System.out.println("Welcome to RJT");
	}
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		ClassOne c=new ClassOne();
		
		System.out.println(ClassOne.x);
		System.out.println(y);
		c.printMessage();
	}

}
