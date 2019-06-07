package com.QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Trainee> pq=new PriorityQueue<Trainee>(4,new TraineeComparator());
		pq.add(new Trainee(3,"tom"));
		pq.add(new Trainee(1,"jack"));
		pq.add(new Trainee(4,"john"));
		pq.add(new Trainee(2,"henry"));
		
		
		while(pq.size()!=0) {			
			Trainee t=pq.remove();
			System.out.println(t.getRank()+","+t.getName());
		}
	}

}
