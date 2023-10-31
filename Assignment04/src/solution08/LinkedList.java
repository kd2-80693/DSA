package solution08;



public class LinkedList {
	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	private Node head;
	private Node tail;

	public LinkedList() {
		head = null;
		tail = null;
	}


	public void addSorted(int data)
	{
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		}
		else if(head.data > data)
		{
			newNode.next = head;
			head= newNode;
		}
		else {
			Node trav = head;
			while(trav.next !=null && trav.next.data < data)
			{
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
		
	}



	public void delFirst() {
		if (isEmpty())
			return;
		else
			head = head.next;
	}

	public void delLast() {
		if (isEmpty())
			return;
		else if (head.next == null) {
			head = null;
			tail = null;
		} else {
			Node trav = head;
			while (trav.next.next != null)
				trav = trav.next;
			tail = trav;
			trav.next = null;
		}
	}

	public void display() {
		Node trav = head;
		while (trav != null) {
			System.out.print("  " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}


	public boolean isEmpty() {
		return head == null;
	}

}
