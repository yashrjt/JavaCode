package com.SortingCollectionDemo;

import java.util.Comparator;

public class SortByNameDemo implements Comparator<Trainee>{

	@Override
	public int compare(Trainee o1, Trainee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
