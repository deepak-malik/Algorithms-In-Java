package com.deepak.algorithms.Iterators;

import java.util.Stack;

import com.deepak.algorithms.Library.TreeNode;

public class DFSForTree {

	public static void main(String[] args) {

	}

	public static void doPreOrder(TreeNode<Integer> root) {
		Stack<TreeNode<Integer>> stack = new Stack<>();
		stack.push(root);
		TreeNode<Integer> current = root;
		while (!stack.isEmpty() && current != null) {
			TreeNode<Integer> itemOnTop = stack.pop();
			System.out.println(itemOnTop + " ");
			if (itemOnTop.hasLeft()) {
				current = itemOnTop.left;
			}
		}
		
	}

	public static void doInOrder(TreeNode<Integer> root) {

	}

	public static void doPostOrder(TreeNode<Integer> root) {

	}

}
