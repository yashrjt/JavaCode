package com.Employee;



public class Accounts{
	
	String name;
	int rank;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Accounts(String name, int rank) {
		super();
		this.name = name;
		this.rank = rank;
	}

	public void accountDept() {
		
		System.out.println("Welcome to Account Dept");
	}
	
	void accountDeptEmployees() {
		System.out.println("There are 100 employees in accounts dept");
	}

	
	
	

}
