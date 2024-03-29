package com.SortingCollectionDemo;

public class Trainee implements Comparable<Trainee> {
	private int age;
	private String name;
	private int rollno;
	private int rank; 
	

	public int getAge() {
		return age;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		if (rollno != other.rollno)
			return false;
		return true;
	}


	public Trainee(int age, String name, int rollno, int rank) {
		super();
		this.age = age;
		this.name = name;
		this.rollno = rollno;
		this.rank = rank;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
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


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	

	@Override
	public int compareTo(Trainee tr) {
		// TODO Auto-generated method stub
	if(this.getAge()<tr.getAge()) {
		return -1;		
	}
	if(this.getAge()> tr.getAge()) {
		return 1;
	}
	return 0;
	}



}
