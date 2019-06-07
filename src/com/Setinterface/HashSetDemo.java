package com.Setinterface;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs=new HashSet();
		hs.add("John");
		hs.add("Tom");
		hs.add("Jack");
		hs.add("Jack");
		hs.add(true);
		hs.add(100);
		
//		hs.add(null);
//		hs.add(null);
		System.out.println(hs);
		Collections.synchronizedSet(hs);
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Java");
		lhs.add("python");
		lhs.add("javascript");
		lhs.add(null);
		lhs.add(null);
	
		
		
		System.out.println(lhs);
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("David");
		ts.add("Henry");
		ts.add("Daniel");
		ts.add("Tom");
		ts.add(null);
		ts.add(null);
		System.out.println(ts);
		
		
	}

}
