package training.interview;

public class LinkedList {

	public static void main(String[] args) {
		
		List list = new List();
		list.add(1);
		list.add(2);
		System.out.println(list.size());
		System.out.println(list);

	}
}

class List {
	
	private static int counter;
	private Node head;
	
	public List() {
		
	}
	
	public void add(Object data) {
		if (head == null) {
			head = new Node(data);		
		}
		
		Node temp = new Node(data);
		Node current = head;
		
		if (current != null) {
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(temp);
		}
		
		incrementCounter();
	}
	
	public void add(Object data, int index) {
		
	}
	
	public String toString() {
		String output = "";
		
		if(head != null) {
			Node current = head.getNext();
			while(current != null) {
				output += "[" + current.getValue().toString() + "]";
				current = current.getNext();
			}
		}
		return output;
	}
	public int size() {
		return counter;
	}
	
	private static int getCounter() {
		return counter;
	}
	
	private static void incrementCounter() {
		counter++;
	}
	
	private void decrementCounter() {
		counter--;
	}
	
	private class Node {
		Object data;
		Node next;

		public Node(Object dataValue) {
			next = null;
			data = dataValue;
		}

		public Node(Object dataValue, Node nextValue) {
			next = nextValue;
			data = dataValue;
		}

		public Object getValue() {
			return data;
		}

		public void setData(Object dataValue) {
			data = dataValue;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node nextValue) {
			next = nextValue;
		}
	}
}