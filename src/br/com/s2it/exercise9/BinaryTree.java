package br.com.s2it.exercise9;

public class BinaryTree {

	public Node root;

	public void add(int value) {
		root = addRecursive(root, value);
	}

	/**
	 * Sum next node into the tree
	 * @param current
	 * @return
	 */
	public int sumNextNode(Node current) {

		if (current == null) {
			return 0;
		}

		if (current == root) {
			return sumNextNode(current.left) + sumNextNode(current.right);
		}

		return sumNextNode(current.left) + sumNextNode(current.right) + current.value;

	}

	/**
	 * Method to add new node
	 * @param current
	 * @param value
	 * @return
	 */
	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

}
