package solution04;

public class BinaryTree {
	public class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int val) {
			data = val;
			left = null;
			right = null;
		}
	}

	private Node root;

	public BinaryTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void add(Node trav, int data) {
		if (trav == null) {
			root = new Node(data);
			return;
		}
		if (data < trav.data) {
			if (trav.left == null) {
				trav.left = new Node(data);
				return;
			} else
				add(trav.left, data);
		} else {
			if (trav.right == null) {
				trav.right = new Node(data);
				return;
			} else
				add(trav.right, data);
		}
	}

	public void add(int data) {
		add(root, data);
	}

	void preOrder(Node trav) {
		if (trav == null)
			return;
		System.out.print(" " + trav.data);
		preOrder(trav.left);
		preOrder(trav.right);
	}

	void preOrder() {
		System.out.print("PreOrder : ");
		preOrder(root);
		System.out.println("");
	}

}
