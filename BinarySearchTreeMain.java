package com.bridgelabz;

public class BinarySearchTreeMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Binary Search program!");
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		tree.inorder();
	}
}
