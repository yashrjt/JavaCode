package com.stringDemo;

public class DemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String literals
		String s="John";
		String s1="John";
		s1="John Zhong";
		//System.out.println(s==s1);
		
		System.out.println(s.equals(s1));
		
		String s2=new String("java");
		String s3=new String("Java");
		
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
//		System.out.println(s2==s3);
		
		StringBuffer sb=new StringBuffer("David ");
		sb.append("Lee");
		sb.reverse();
		System.out.println(sb);
		
	}

}
