package com.polymorphism;

public class DemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greet g=new Greet();
		g.greet("Good Day");
		g.greet("GoodDay", "Yash");

	}

}


class Greet{
	
	void greet(String s) {
		System.out.println(s);
	}
	
	void greet(String s,String s1) {
		System.out.println(s+" , "+s1);		
	}
}