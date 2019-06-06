package com.collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer in=a;//Autoboxing--converts primitives to objects
		
		int x=in;//unboxing--converts objects to primitives
		
		int b=20;
		
		int[] arr=new int[] {10,20,30,40};
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		ArrayList al2=new ArrayList();
		
		al2.add(10);
		al2.add("John");
		al2.add(true);
		
		System.out.println(al2);
				
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		System.out.println(al.contains(60));
		
		System.out.println("Size of arraylist"+al.size());
		//iterate over
		for(Integer i:al) {
			System.out.println(i);
		}
		
		
		//unboxing
		int y=al.get(0);

	}

}
