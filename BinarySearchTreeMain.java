package com.bridgelabz;

public class BinarySearchTreeMain {
	static boolean flag = true;
	
	public static void main(String[] args) {

		System.out.println("Welcome to Binary Search program!");

		BinarySearchTree tree = new BinarySearchTree();
		// Add node to binary tree
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);

		System.out.println("\nBinary search tree after insertion of element");

		// Display the binary tree
		tree.inorderDisplay(tree.root);

		tree.insert(22);
		tree.insert(40);
		tree.insert(60);
		tree.insert(95);
		tree.insert(65);
		tree.insert(11);
		tree.insert(3);
		tree.insert(16);
		tree.insert(63);
		tree.insert(67);

		System.out.println("\n\nBinary search tree after insertion more element");

		// Display the binary tree
		tree.inorderDisplay(tree.root);

		// Search element in binary tree
		tree.searchNode(tree.root, 63);
		if (flag) {
			System.out.println("\n\n63 element is present in binary tree");
		} else {
			System.out.println("\n63 element is absent in binary tree");
		}
	}
}
