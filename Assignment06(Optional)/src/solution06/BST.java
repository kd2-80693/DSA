package solution06;

public class BST {
	public class Node
	{
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
	public BST() {
		root = null;
	}
	public boolean isEmpty()
	{
		return root == null;
	}
	
	public void add(int val)
	{
		Node node = new Node(val);
		
		if(isEmpty())
			root = node;
		else
		{
			Node trav = root;
			while(true)
			{
				if(val < trav.data)
				{
					if(trav.left == null)
					{
						trav.left = node;
						break;
					}
					trav = trav.left;
				}
				else
				{
					if(trav.right == null)
					{
						trav.right = node;
						break;
					}
					trav = trav.right;
				}
			}
		}
		
	}
	public void preOrder(Node trav)
	{
		if(trav == null)
			return;

		System.out.print(" "+ trav.data);
		preOrder(trav.left);
		preOrder(trav.right);
	}
	public void preOrder()
	{
		System.out.print("PreOrder : ");
		preOrder(root);
		System.out.println("");
	}
	
	public void inOrder(Node trav)
	{
		if(trav == null)
			return;

		inOrder(trav.left);
		System.out.print(" "+ trav.data);
		inOrder(trav.right);
	}
	public void inOrder()
	{
		System.out.print("inOrder : ");
		inOrder(root);
		System.out.println("");

	}
	
	public void postOrder(Node trav)
	{
		if(trav == null)
			return;

		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(" "+ trav.data);
	}
	public void postOrder()
	{
		System.out.print("PostOrder : ");
		postOrder(root);
		System.out.println("");
	}
	
	public Node bSearch(int key , Node trav)
	{
		if(trav == null)
			return null;
		if(trav.data == key)
			return trav;
		else if(key < trav.data)
			return bSearch(key, trav.left);
		else
			return bSearch(key, trav.right);
		
		
	}
	
	public Node binarySearch(int key)
	{
		return bSearch(key , root);
	}
	
	public int countNonLeaf(Node trav)
	{
		if((trav == null) || (trav.left == null && trav.right == null))
			return 0;
		int c1 = countNonLeaf(trav.left);
		int c2 = countNonLeaf(trav.right);
		return c1 + c2 +1;
	}
	public void countNonLeaf()
	{
		System.out.println("Count : " + countNonLeaf(root));
	}
	
	public int level(int key , Node trav)
	{
		if(trav == null)
			return 0;
		if(trav.data == key)
			return 1;
		else if(key < trav.data)
			return level(key, trav.left)+1;
		else
			return level(key, trav.right)+1;
		
	}
	
	public int level(int key)
	{
		return level(key , root);
	}
	
	public int parent(int key , Node trav , Node paren)
	{
		if(trav == null)
			return -1;
		if(trav == root && trav.data == key)
			return -1;
		if(trav.data == key)
			return paren.data;
		else if(key < trav.data)
			return parent(key, trav.left , trav);
		else
			return parent(key, trav.right , trav);
	}
	
	public int parent(int key)
	{
		return parent(key , root , null);
	}
	
}
