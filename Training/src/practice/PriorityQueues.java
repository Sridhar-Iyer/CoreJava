package practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {
		PriorityQueue<Integer> maxPQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		maxPQ.add(10);
		maxPQ.add(5);
		maxPQ.add(65);
		maxPQ.add(5);
		maxPQ.add(70);
		maxPQ.add(10);
		
		PriorityQueue<Integer> minPQ = new PriorityQueue<Integer>();
		minPQ.add(10);
		minPQ.add(5);
		minPQ.add(65);
		minPQ.add(5);
		minPQ.add(70);
		minPQ.add(10);

		System.out.println(minPQ);
		System.out.println(maxPQ);
	}

}
