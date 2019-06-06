package com.Basics;

public class ClassFour extends ClassFive {

	int age;
	String name;
	
	ClassFour(){		
		this("Good Day");
		System.out.println("Child class no arg cons");
		
	}
	
	
	ClassFour(String s){		
		System.out.println("Called from String constructor");
	}
	
	public ClassFour(int age, String name) {
		super(10,"Java");
		this.age = age;
		this.name = name;
		System.out.println("Called from int,String constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassFour cf=new ClassFour();
		System.out.println("Called from main method");
	}

}


class ClassFive{
	ClassFive(){
		System.out.println("Parent class no arg cons");
	}
	
	ClassFive(int y,String z){
		System.out.println("Parent class 2 arg cons");
	}
}
