package com.SortingCollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
		al.add("canada");
		al.add("new york");
		al.add("chicago");
		al.add("dallas");
		
		
		Collections.synchronizedList(al);
	
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			al.add("california");
		}
		
	}

}
