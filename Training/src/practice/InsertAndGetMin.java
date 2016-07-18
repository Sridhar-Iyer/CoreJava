package practice;

/**
 * Amazon Interview question
 * Implement a data structure with the following APIs
 *	void add(int) - 3,12,5,6,1
 *	int getMin() - 1,3,5,6,12
 *
 */

import java.util.Set;
import java.util.TreeSet;

public class InsertAndGetMin {

	private static TreeSet<Integer> ts = new TreeSet<Integer>();
	
	public static void main(String[] args) {
		insert(3);
		insert(12);
		insert(5);
		insert(6);
		insert(1);
		System.out.println(getMin());
		System.out.println(showSet());

	}

	public static void insert(Integer number) {
		ts.add(number);
	}
	
	public static Integer getMin() {
		return ts.first();
	}
	
	public static Set<Integer> showSet() {
		return ts;
	}
}
