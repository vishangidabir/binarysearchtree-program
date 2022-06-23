package com.bridgelabz;

import java.util.Stack;

public class BinarySearchTree {
	Node root;

	public void insert(int value) {
		Node node = new Node(value);
		if (root == null) {
			root = node;
			return;
		}
		if (root.data > value) {
			if (root.left == null) {
				root.left = node;
				return;
			} 
			else if(root.left != null) {
				root = root.left;
				root.right= node;
				return;
			}
			//insert(value);
		}
		else if (root.data < value) {
			if (root.right == null) {
				root.right = node;
				return;
			}
			//insert(value);
		}
	}

	public void inorder() {
		Node temp = root;
		Stack<Node> stack = new Stack<>();
		while (temp != null || !stack.isEmpty()) {
			if (temp != null) {
				stack.add(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
				System.out.print(temp.value + " ");
				temp = temp.right;
			}
		}
	}

}