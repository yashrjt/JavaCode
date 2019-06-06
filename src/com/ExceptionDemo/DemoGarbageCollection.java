package com.ExceptionDemo;

public class DemoGarbageCollection {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		DemoGarbageCollection dm=new DemoGarbageCollection();		
		dm=null;		
		System.gc();
		
	}
	protected void finalize() {
		System.out.println("Finalize method called");
	}

}
