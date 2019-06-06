package com.scannerDemo;

import java.util.Scanner;

public class DemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter name");
		String name=sc.nextLine();
		System.out.println("The user enetered the name :"+ name);
		System.out.println("Please enter age");
		int age=sc.nextInt();	
		System.out.println("AGe of user is: "+age);
		

	}

}
