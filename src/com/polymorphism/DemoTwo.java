package com.polymorphism;

public class DemoTwo extends GreetPeople{

	void greetPeople() {
		System.out.println("greetings from child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GreetPeople	d=new DemoTwo();
		GreetPeople d=new GreetPeople();
		d.greetPeople();
		}

}


class GreetPeople{
	void greetPeople() {
		System.out.println("greetings from parent class");
	}
}
