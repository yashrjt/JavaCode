package com.collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Tom");
		ll.add("John");
		ll.add("David");
		
		LinkedList<String> llist=new LinkedList<String>();
		llist.add("Tim");
		llist.add("Jack");
		llist.add("Eric");
		
		ll.addAll(3,llist);
		
		
		
		System.out.println("Advanced for loop");
		for(String s:llist) {		
			System.out.println(s);
		}
		System.out.println("-----------------");
		
		System.out.println("Iterator");
		
		Iterator i=llist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("-----------------");
		ListIterator li=llist.listIterator();
		System.out.println("list iterator");
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("Previous");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
