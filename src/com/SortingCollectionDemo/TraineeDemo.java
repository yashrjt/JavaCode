package com.SortingCollectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class TraineeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee t1=new Trainee(25,"John",100,12);
		Trainee t2=new Trainee(23,"Jack",110,1);
		Trainee t3=new Trainee(20,"david",101,3);
		Trainee t4=new Trainee(22,"eric",103,20);
		Trainee t5=new Trainee(21,"henry",200,30);
		
		ArrayList<Trainee> arl=new ArrayList<Trainee>();
		arl.add(t1);
		arl.add(t2);
		arl.add(t3);
		arl.add(t4);
		arl.add(t5);

		Collections.sort(arl);
		
		for(Trainee t:arl) {
			System.out.println(t.getAge()+" , "+t.getName());
		}
		
		System.out.println("Sort according to roll number");

		Collections.sort(arl,new SortByTraineeName());
		
		for(Trainee t:arl) {
			System.out.println(t.getRollno()+" , "+t.getName());
		}
		
		System.out.println("Sort according to rank");

		Collections.sort(arl,new SortByTraineeRank());
		
		for(Trainee t:arl) {
			System.out.println(t.getRank()+" , "+t.getName());
		}
	}

}
