package com.mapInterfaceDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		
		ht.put(30174, "st.charles");
		ht.put(32822,"Orlando");
		ht.put(12345,"Dallas");
		ht.put(76578,"san fransisco");
		ht.put(778,"san diego");
		//NUll value,keys are not allowed
//		ht.put(7890,null);
		
		
		for(Integer i:ht.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("-----------");
		for(String s:ht.values()) {
			System.out.println(s);
		}
		
		System.out.println("------------");
		for(Map.Entry<Integer,String> item: ht.entrySet()) {
			System.out.println(item.getKey()+" , "+ item.getValue() );
			
		}
		
		System.out.println("------------");
		System.out.println("Iterator ");
		Iterator<Map.Entry<Integer,String>> i=ht.entrySet().iterator();
		while(i.hasNext()) {
			Map.Entry<Integer,String> entry=i.next();
			System.out.println(entry.getKey()+" , "+ entry.getValue() );
			
		}
		
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(30174, "st.charles");
		hm.put(32822,"Orlando");
		hm.put(12345,"Dallas");
		hm.put(76578,"san fransisco");
		hm.put(null,"canada");
//		hm.put(null,"abc");
		hm.put(1231,null);
		hm.put(8765,null);
		
		//synchronizes the hashmap object
		Collections.synchronizedMap(hm);
		
		System.out.println("------------");
		System.out.println("Hashmap");
		for(Map.Entry<Integer,String> item: hm.entrySet()) {
			System.out.println(item.getKey()+" , "+ item.getValue() );
			
		}
		
		
		TreeMap<Integer,String> tm =new TreeMap<Integer,String>();
		tm.put(10,"abc");
		tm.put(3,"xyz");
		tm.put(2,"yui");
		tm.put(8,"iop");
		tm.put(12,null);
		
		
		System.out.println("value of key 8 is "+tm.get(8));
		System.out.println("------------");
		System.out.println("Treemap");
		for(Map.Entry<Integer,String> item: tm.entrySet()) {
			System.out.println(item.getKey()+" , "+ item.getValue() );
			
		}
		
		}

}
