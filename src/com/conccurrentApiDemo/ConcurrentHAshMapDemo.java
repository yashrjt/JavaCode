package com.conccurrentApiDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHAshMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentHashMap<Integer,String> hm=new ConcurrentHashMap<Integer,String>();
		
		hm.put(30174, "st.charles");
		hm.put(32822,"Orlando");
		hm.put(12345,"Dallas");
		hm.put(76578,"san fransisco");
		
		
		Iterator<Integer> i=hm.keySet().iterator();
		while(i.hasNext()) {
			
			Integer key=i.next();
			System.out.println(hm.get(key));
			hm.put(6666, "california");
		}
		
		
		
		
		
		
		
		
	}

}
