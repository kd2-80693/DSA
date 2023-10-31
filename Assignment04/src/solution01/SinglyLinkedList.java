package solution01;

public class SinglyLinkedList {
	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	private Node head;
	private Node tail;

	public SinglyLinkedList() {
		head = null;
		tail = null;
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
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
		} 
		else {
			Node trav = head;
			while (trav.next.next != null)
				trav = trav.next;
			tail = trav;
			trav.next = null;
		}
	}
	
	public void display()
	{
		Node trav = head;
		while(trav != null)
		{
			System.out.println("  " + trav.data);
			trav = trav.next;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

}
