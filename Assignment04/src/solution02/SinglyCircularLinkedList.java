package solution02;

import solution01.SinglyLinkedList.Node;

public class SinglyCircularLinkedList {
	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private Node tail;

	public void addFirst(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			tail = node;
			tail.next = node;
		} else {
			node.next = tail.next;
			tail.next = node;
		}
	}

	public void addLast(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			tail = node;
			tail.next = node;
		} else {
			node.next = tail.next;
			tail.next = node;
			tail = node;
		}
	}

	public void deleteFirst() {
		if (isEmpty())
			return;
		else if (tail.next == tail) {
			tail = null;
		} else {
			tail.next = tail.next.next;
		}
	}

	public void deleteLast() {
		if (isEmpty())
			return;
		else if (tail.next == tail) {
			tail = null;
		} else {
			Node trav = tail;
			while (trav.next != tail) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
			tail = trav;
		}
	}

	public void display() {
		Node trav = tail;
		while (trav != null) {
			System.out.println("  " + trav.data);
			trav = trav.next;
		}
	}

	public boolean isEmpty() {
		return tail == null;
	}

}
