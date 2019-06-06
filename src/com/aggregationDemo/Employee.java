package com.aggregationDemo;

public class Employee {
	
	String name;
	int ssn;	
	Address add;
	

	public Employee(String name, int ssn, Address add) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.add = add;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a=new Address("NAtional drive",100,"chicago");
		Employee e=new Employee("jack",40,a);
		System.out.println(e);
		
	}


	@Override
	public String toString() {
		return "Employee Details : Name:" + name + ", ssn:" + ssn + ", add:" + add ;
	}

}
