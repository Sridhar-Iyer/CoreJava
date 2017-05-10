package training.interview.stack;

public class MinArrayStack {

	public static void main(String[] args) {
		MinStack stack = new MinStack();
		stack.display();
		stack.pop();
		stack.push(4);
		stack.push(21);
		stack.min();
		stack.push(31);
		stack.push(3);
		stack.push(2);
		stack.min();
		stack.push(41);
		stack.push(1);
		stack.min();
		stack.push(1);
		stack.push(41);
		stack.push(1);
		stack.min();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(41); // this will error
		stack.display();
		stack.min();
		stack.pop();
		stack.display();
	}
}

class MinStack {
	private static final int[] stackArray = new int[10];
	private static final int[] minStack = new int[10];
	private static int top = -1;
	private static int minTop = -1;

	public void push(int element) {
		top++;
		if (top == stackArray.length) {
			System.out.println("Stack Array is full, can't insert");
		} else {
			stackArray[top] = element;
		}
		if(top == 0) {
			minStack[++minTop] = element;
		}else {
			if(element <= minStack[minTop]) {
				minStack[++minTop] = element;
			}
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Nothing to pop, stack is empty");
		} else {
			int element = stackArray[top];
			top--;
			System.out.println("Element poped from stackArray: " + element);
			if(element == minStack[minTop]) {
				minTop--;
			}
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
	
	public void min() {
		System.out.println("The minimum element in the stack is : " + minStack[minTop]);	
	}
}
