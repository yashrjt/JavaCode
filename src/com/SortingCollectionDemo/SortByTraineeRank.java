package com.SortingCollectionDemo;

import java.util.Comparator;

public class SortByTraineeRank  implements Comparator<Trainee>{

	@Override
	public int compare(Trainee t1, Trainee t2) {
		// TODO Auto-generated method stub
		if(t1.getRank()<t2.getRank()) {
			return 1;		
		}
		if(t1.getRank()> t2.getRank()) {
			return -1;
		}
		return 0;
		}
	}


