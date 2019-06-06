package com.abstractClass;

public interface LoanInterface {
	
	int loanAmount=50000;
	
	 default void greeting() {
			System.out.println("Welcome User");
		}
	  void loanCriteria();

}
