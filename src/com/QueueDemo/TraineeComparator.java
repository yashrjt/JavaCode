package com.QueueDemo;

import java.util.Comparator;

public class TraineeComparator implements Comparator<Trainee> {

	@Override
	public int compare(Trainee o1, Trainee o2) {
		// TODO Auto-generated method stub
		return o1.getRank()-o2.getRank();
	}

}
