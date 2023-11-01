package solution01;

public class DoubleCircularLinkedList {
	
	public class Node
	{
		private int data ;
		private Node next;
		private Node previous;
		public Node(int val) {
			data = val;
			next = null;
			previous = null;
		}
	}
	
	private Node head;
	
	public DoubleCircularLinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addAtPos(int data , int pos )
	{
		Node newNode = new Node(data);
		if(isEmpty() )
		{
			head = newNode;
			head.next = newNode;
			head.previous = newNode;
		}
		else if(head.next == head)
		{
			if(pos<=1)
			{
				newNode.next = head;
				newNode.previous = head;
				head.next = newNode;
				head.previous = newNode;
				head = newNode;
			}
			else
			{
				newNode.next = head;
				newNode.previous = head;
				head.next = newNode;
				head.previous = newNode;
			}
		}
		else if(pos <=1)
		{
			newNode.next = head;
			newNode.previous = head.previous;
			head.previous = newNode;
			newNode.previous.next = newNode;
			head = newNode;
		}
		
		else {
			Node trav = head;
			for(int i = 1 ; i < pos-1 && (trav.next != head)  ; i++)
			{
				trav = trav.next;
			}
			newNode.next = trav.next;
			newNode.previous = trav;
			trav.next = newNode;
			newNode.next.previous = newNode;	
		}
	}
	
	public void deleteAtPos(int pos)
	{
		if(isEmpty() )
			return;
		else if(head.next == head)
		{
			head = null;
		}
		else if(head.next.next == head)
		{
			if(pos <= 1)
			{
				head = head.next;
				head.next = head;
				head.previous = head;
			}
			else
			{
				head.next = head;
				head.previous = head;
			}
		}
		else if(pos <= 1)
		{
			head.next.previous = head.previous;
			head.previous.next = head.next;
			head = head.next;
			
		}
		else {
			Node trav = head;
			for(int i = 1 ; i < pos && (trav.next != head)  ; i++)
			{
				trav = trav.next;
			}
			
			trav.next.previous = trav.previous;
			trav.previous.next = trav.next;
				
		}
		
		
	}
	public void fDisplay() {
		if(isEmpty())
			return;
		//1. create trav and start at head
		Node trav = head;
		System.out.print("Forward List : ");
		do {
			//2. visit current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}while(trav != head);	//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	
	
}
