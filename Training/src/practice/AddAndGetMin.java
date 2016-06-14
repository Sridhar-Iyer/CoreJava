package practice;

import java.util.Set;
import java.util.TreeSet;

/*
 * 
 *  Amazon Interview question
Implement a data structure with the following APIs
	void add(int) - 3,12,5,6,1
	int getMin() - 1,3,5,6,12
 * 
 * 
 */
public class AddAndGetMin {
	
	private static TreeSet<Integer> numberSet = new TreeSet<Integer>();

	public static void main(String[] args) {
		add(3);
		add(12);
		add(5);
		add(6);
		add(1);
		System.out.println(getMin());

	}
		
	private static void add(Integer number) {
		numberSet.add(number);
	}
	
	private static Integer getMin() {
		System.out.println(numberSet);
		return numberSet.first();
	}

}
