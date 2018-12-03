package practice.interview.enlighted;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	
	Node root;
	Node child;
	
	class Node {
		int data;
		Node parent;
		List<Node> children;
		
		Node() {
			parent = null;
		}

		public List<Node> getChildren() {
			return children;
		}

		public void setChildren(List<Node> children) {
			this.children = children;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + " Parent= " + parent  + "]";
		}	
		
		
	}
	
	Tree() {
		root = null;
	}
	
	public Node add(Node parent, int data) {
		Node node;
		if (root == null) {
			root = new Node();
			root.data = data;
			root.parent = parent;
			root.children = null;
			node = root;
		} else {
			child = new Node();
			child.data = data;
			child.parent = parent;
			List<Node> childList = parent.getChildren();
			if(childList == null) {
				childList = new ArrayList<Node>();
				childList.add(child);
			}	else 	
			childList.add(child);
			parent.setChildren(childList);
			node = child;
		}
		return node;
	}
	
	
	
	@Override
	public String toString() {
		return "Tree [root=" + root + ", child=" + child + "]";
	}

	public void display() {
		 
			 if(root != null) {
				 System.out.println(root.data); System.out.println("|");
				 if(root.children != null) {
					 for(Node child : root.children) {
					 System.out.println("-" + child.data);
					 if(child.children != null) {
						 for( Node subChild : child.children)
							 System.out.println("--" + subChild.data);
					 }
				 } }
			 }
			
		
	}

	public static void main(String[] args) {
		Tree tree = new Tree();
		Node tenNode = tree.add(null, 10);
		Node twentyNode = tree.add(tenNode, 20);
		Node thirtyNode = tree.add(tenNode, 30);
		Node fortyNode = tree.add(twentyNode, 40);
		Node fiftyNode = tree.add(fortyNode, 50);
		System.out.println(tenNode);
		System.out.println(twentyNode);
		System.out.println(thirtyNode);
		System.out.println(fortyNode);
		System.out.println(tree);
		tree.display();
	}

}
