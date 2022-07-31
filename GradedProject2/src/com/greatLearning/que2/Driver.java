package com.greatLearning.que2;

import com.greatLearning.que2.Services.Node;

public class Driver {

	public static void main(String[] args) {

		Services tree = new Services();

		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		tree.BinaryTreeToSkewed(tree.node);
		tree.traverseSkewed(tree.headnode);

	}

}
