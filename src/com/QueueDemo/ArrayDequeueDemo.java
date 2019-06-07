package com.QueueDemo;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> ad=new ArrayDeque<String>();
		ad.offer("tom");
		ad.offer("jim");
		
		Iterator<String> it=ad.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------");
		ad.offerFirst("jack");
		
		Iterator<String> it1=ad.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("--------");
		ad.offerLast("eric");
		
		Iterator<String> it2=ad.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		

		System.out.println("--------");
		ad.pollFirst();
		
		Iterator<String> it3=ad.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		System.out.println("--------");
		ad.pollLast();
		
		Iterator<String> it4=ad.iterator();
		while(it4.hasNext()) {
			System.out.println(it4.next());
		}
		
	}

}
