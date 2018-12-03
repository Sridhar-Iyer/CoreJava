package training.interview;

// Reverse linklist using recursion

public class ReverseLinkList {

	private Node headNode = null;

	public static void main(String[] args) {
		ReverseLinkList rll = new ReverseLinkList();
		rll.add("A");
		rll.add("B");
		rll.add("C");
		System.out.println(rll);

	}

	public void add(String data) {
		if (headNode == null) {
			headNode = new Node(data);
		} else {
			Node tempNode = new Node(data);
			Node currentNode = headNode;

			if (currentNode != null) {
				while (currentNode.getNext() != null) {
					currentNode = currentNode.getNext();
				}
				currentNode.setNext(tempNode);
			}
		}
	}

	@Override
	public String toString() {
		String output = "[Data Nodes = ";
		Node tempNode = headNode;
		while (tempNode.getNext() != null) {
			output = output + tempNode.getData() + ",";
			tempNode = tempNode.getNext();
		}
		output = output + tempNode.getData() + "]";
		return output;
	}

}

class Node {
	
	private String data;
	private Node next;

	public Node(String data) {
		this.data = data;
		next = null;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
