package solution02;

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
	
	
	public void delete(int key , Node trav , Node parent)
	{
		while(trav!= null)
		{
			if(key == trav.data)
				break;
			else if(key < trav.data)
			{
				parent = trav;
				trav = trav.left;
				
			}
			else
			{
				parent = trav;
				trav = trav.right;
			}
		}
		if(trav == null)
			return ;
		else 
		{
			
			
			if(trav.right != null && trav.left != null)
			{
				parent = trav;
				Node succ = trav.right;
				while(succ.left != null) {
					parent = succ;
					succ = succ.left;
				}
				trav.data = succ.data;
				if(parent!=trav)
					parent.left = succ.right;
				else
					parent.right = succ.right;

			}
			else if(trav.right == null)
			{
				if(trav == root)
				{
					root = trav.left;
				}
				else if(parent.left == trav)
				{
					parent.left = trav.left;
				}
				else
				{
					parent.right = trav.left;
				}
				
			}
			else
			{
				if(trav == root)
				{
					root = trav.right;
				}
				else if(parent.left == trav)
				{
					parent.left = trav.right;
				}
				else
				{
					parent.right = trav.right;
				}
					
			}
				
		}
	}
	
	public void delete(int key)
	{
		delete(key , root, null);
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
	
	
	
}
