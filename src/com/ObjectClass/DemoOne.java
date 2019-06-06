package com.ObjectClass;

public class DemoOne {

	String name;
	int age;
	
	public DemoOne(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "DemoOne [name=" + name + ", age=" + age + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoOne d=new DemoOne("Eric",25);
		System.out.println(d);
		String s=new String("jack");
		String s1=new String("jack");
		System.out.println(s.equals(s1));
		
	}

}
