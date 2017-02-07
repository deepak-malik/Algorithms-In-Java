/**
 * Algorithms-In-Java
 * TreeNode.java
 */
package com.deepak.algorithms.Library;

/**
 * TreeNode class
 * 
 * @author Deepak
 *
 * @param <T>
 */
public class TreeNode<T> {

	/* Data in the node, left child and right child */
	public T item;
	public TreeNode<T> left;
	public TreeNode<T> right;

	/**
	 * Constructor
	 * 
	 * @param item
	 */
	public TreeNode(T item) {
		this.item = item;
	}

	public boolean hasLeft() {
		return left != null;
	}

	public boolean hasRight() {
		return right != null;
	}

}
