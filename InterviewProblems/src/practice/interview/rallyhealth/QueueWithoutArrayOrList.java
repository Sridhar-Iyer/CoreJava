package practice.interview.rallyhealth;

import java.util.HashMap;
import java.util.Map;

/**
 * Assume in interview land that all lists are broken. Array ArrayList,
 * LinkedList, SkipList Stacks, Queues, Dequeues etc. The Queuue needs to meet
 * the following interface.
 * 
 */

interface Queue<T> {
	public void enqueue(T t);

	public T dequeue();
}

public class QueueWithoutArrayOrList<T> implements Queue<T> {

	static Integer counter = 0;
	static Integer key = 0;
	Map<Integer, T> queue = new HashMap<>();

	@Override
	public void enqueue(T t) {
		queue.put(++counter, t);
	}

	@Override
	public T dequeue() {
		T t = queue.remove(++key);
		return t;
	}
	
	public boolean isQueueEmpty() {
		if (queue.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		QueueWithoutArrayOrList<Integer> qu = new QueueWithoutArrayOrList<>();
		qu.enqueue(1);
		qu.enqueue(2);
		qu.enqueue(3);
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		System.out.println(qu.isQueueEmpty());
	}
}
