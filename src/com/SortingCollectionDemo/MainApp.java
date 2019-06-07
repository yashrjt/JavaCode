package com.SortingCollectionDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trainee t1=new Trainee(25,"John",100,12);
		Trainee t2=new Trainee(23,"Jack",110,1);
		Trainee t3=new Trainee(20,"David",101,3);
		Trainee t4=new Trainee(22,"Eric",103,20);
		Trainee t5=new Trainee(21,"Henry",200,30);
		Trainee t6=new Trainee(21,"Henry",200,30);
		
		HashSet<Trainee> hs=new HashSet<Trainee>();
		
		HashSet<String> hss=new HashSet<String>();
		
		hss.add("Henry");
		hss.add("Henry");
		
		for(String tr:hss) {
			System.out.println(tr);
		}
		
		System.out.println("----------");
		hs.add(t1);
		hs.add(t2);
		hs.add(t3);
		hs.add(t4);
		hs.add(t5);
		hs.add(t6);
		
		for(Trainee tr:hs) {
			System.out.println(tr.getName());
		}
		
	
		HashMap<Trainee,Integer> hm=new HashMap<Trainee,Integer>();
		
		hm.put(t1,101);
		hm.put(t2,102);
		hm.put(t3,103);
		hm.put(t4,104);
		hm.put(t5,105);
		hm.put(t6,106);
		
		System.out.println("------------");
		System.out.println("Hashmap output");
		for(Map.Entry<Trainee,Integer> item: hm.entrySet()) {
			System.out.println(item.getKey().getName() );
			
		}
	}

}
