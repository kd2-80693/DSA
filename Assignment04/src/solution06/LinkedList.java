package solution06;

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

	public boolean addAfter(int data, int after) {
		Node newNode = new Node(data);
		if (isEmpty())
			return false;
		else {
			Node trav = head;
			while (trav != null) {
				if (trav.data == after)
					break;
				else
					trav = trav.next;
			}
			if (trav == null)
				return false;
			newNode.next = trav.next;
			trav.next = newNode;
			return true;
		}
	}

	public boolean addBefore(int data, int before) {
		Node newNode = new Node(data);
		if (isEmpty())
			return false;
		else if (head.data == before) {
			newNode.next = head;
			head = newNode;
			return true;
		} else {
			Node trav = head;
			while (trav.next != null) {
				if (trav.next.data == before)
					break;
				else
					trav = trav.next;
			}
			if (trav.next == null)
				return false;
			newNode.next = trav.next;
			trav.next = newNode;
			return true;
		}

	}

	public void sort() {
		if (isEmpty() || head.next == null)
			return;
		else {
			Node trav = head;
			Node ref = head;
			while (ref.next != null) {
				trav = head;
				while (trav.next != null) {
					if (trav.data > trav.next.data) {
						int temp = trav.data;
						trav.data = trav.next.data;
						trav.next.data = temp;;
					}
					trav = trav.next;
				}
				ref = ref.next;
			}
		}

	}

	public boolean isEmpty() {
		return head == null;
	}

}
