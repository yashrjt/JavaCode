package com.encapsulation;

public class DemoThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();		
		s.setAge(25);
		System.out.println(s.getAge());
	}

}

class Student{

	
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}