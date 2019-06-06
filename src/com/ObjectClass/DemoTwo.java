package com.ObjectClass;

public class DemoTwo {

	String name;
	int age;
	
	public DemoTwo(String string, int i) {
		// TODO Auto-generated constructor stub
		this.name=string;
		this.age=i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoTwo d=new DemoTwo("John",30);
		DemoTwo d2=new DemoTwo("Tom",25);
		
		
		System.out.println(d.getClass());
		
	}
	

	

}
