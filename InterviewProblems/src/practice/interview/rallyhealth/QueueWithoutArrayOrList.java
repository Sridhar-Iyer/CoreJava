package practice.interview.rallyhealth;

/**
 * Assume in interview land that all lists are
 * broken. Array ArrayList, LinkedList, SkipList
 * Stacks, Queues, Dequeues etc. The Queuue 
 * needs to meet the following interface.
 * 
 */

interface Queue<T> {
	public void enqueue(T t);
	public T dequeue();
}

public class QueueWithoutArrayOrList<T> implements Queue<T> {

	@Override
	public void enqueue(T t) {
		
		
	}

	@Override
	public T dequeue() {
		
		return null;
	}

}
