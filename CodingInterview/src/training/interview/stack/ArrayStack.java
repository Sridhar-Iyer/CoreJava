package training.interview.stack;

public class ArrayStack {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.display();
		stack.pop();
		stack.push(1);
		stack.push(21);
		stack.push(31);
		stack.push(41);
		stack.push(41);
		stack.push(41);
		stack.push(41);
		stack.push(41);
		stack.push(41);
		stack.push(41);
		stack.push(41); // this will error
		stack.display();
		stack.pop();
		stack.display();
	}
}

class Stack {
	private static final int[] stackArray = new int[10];
	private static int top = -1;

	public void push(int element) {
		top++;
		if (top == stackArray.length) {
			System.out.println("Stack Array is full, can't insert");
		} else {
			stackArray[top] = element;
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Nothing to pop, stack is empty");
		} else {
			int element = stackArray[top];
			top--;
			System.out.println("Element poped from stackArray: " + element);
		}
	}

	public void display() {
		System.out.print("[ ");
		if (top >= 10) {
			top = 9;
		}
		for (int i = 0; i <= top; i++) {
			System.out.print(stackArray[i] + " , ");
		}
		System.out.print("] ");
		System.out.println();
	}
}
