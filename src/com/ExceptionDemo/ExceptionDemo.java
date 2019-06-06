package com.ExceptionDemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int x=500/50;	
			//System.exit(0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		//clean up the resources like closing connections 
		finally {
			System.out.println("Finally block");
		}

	}

}
