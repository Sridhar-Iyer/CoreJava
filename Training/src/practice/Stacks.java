package practice;

import java.util.Iterator;
import java.util.Stack;


//  Apple interview question

/*
 * 
 * Implement peek operation using Iterator
 * 
 */

public class Stacks {
	
	public static void main(String[] args) {
		
		Stack<Integer> myStack = new Stack<Integer>();
		
		myStack.push(5);
		myStack.push(7);
		myStack.push(8);
		
		System.out.println(peek(myStack));
		System.out.println(peek(myStack));
		System.out.println(peek(myStack));
		System.out.println(peek(myStack));
		System.out.println(peek(myStack));
		
	/*	System.out.println(myStack.peek());
		System.out.println(myStack);
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
		System.out.println(myStack);*/
		
	}
	
	public static Integer peek(Stack<Integer> stack) {
		Iterator<Integer> stackIterator =  stack.iterator();
		Integer number = 0;
			while(stackIterator.hasNext()) {
				number = (Integer) stackIterator.next();
			}
		return number;
	}

}
