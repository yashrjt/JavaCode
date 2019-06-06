package com.multipleInheritance;

public class MainClass extends ParentOne{
	
	void display() {
		System.out.println("Display from Main class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass m=new MainClass();
		m.display();
		m.displayGraph();
	}

}
