package com.Salary;


import com.Employee.*;

public class MainDemo extends HR{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accounts a=new Accounts();
		a.accountDept();
		//Default members visible only in package level
//		a.accountDeptEmployees();
		
		MainDemo m=new MainDemo();
		m.hrDeptEmployees();
	}

}
