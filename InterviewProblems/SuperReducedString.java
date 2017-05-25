package hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class SuperReducedString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		SuperReducedString srs = new SuperReducedString();
		System.out.println( srs.reducedString(string));
	}
	
	public String reducedString(String string) {
		Stack<Character> stack = new Stack();
		String reducedString = "";
		int top = 0;
		for(int i = 0 ; i < string.length(); i++) {
			if(stack.size() == 0) {
				stack.push(string.charAt(i));
				stack.push(string.charAt(++i));
			} else {
				stack.push(string.charAt(i));
			}
			
			top = stack.size();
			if(stack.elementAt(--top) == stack.elementAt(--top)) {
				stack.pop();
				stack.pop();
			}
		}
		
		if(stack.size() == 0) { return reducedString = "EMPTY STRING" ; }
		else {
			 for(int i = 0 ; i < stack.size(); i++) {
				 reducedString = reducedString + stack.elementAt(i);
			 }
			 return reducedString;
		}
	}
}
