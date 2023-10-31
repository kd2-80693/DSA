package solution10;

public class LinkedList {
	public class Node {
		private Employee data;
		private Node next;

		public Node(Employee data) {
			this.data = data;
		}

	}

	private Node head;
	private Node tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public void addFirst(Employee data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast(Employee data) {
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
			System.out.println("" + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}

	public boolean addAfter(Employee data, Employee after) {
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

	public boolean addBefore(Employee data, Employee before) {
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

	public Employee findEmployee(String name) {
		Node trav = head;
		while (trav != null && !(trav.data.getName().equals(name))) {
			trav = trav.next;
		}
		if(trav == null)
			return null;
		return trav.data;

	}

	public void deleteEmployee(int empid) {
		if (isEmpty())
			return;
		else if (head.data.getEmpid() == empid) {
			head = head.next;
		} else {
			Node trav = head;
			while (trav.next != null && trav.next.data.getEmpid() != empid) {
				trav = trav.next;
			}
			if(trav.next == null)
				return ;
			trav.next = trav.next.next;
		}
	}
	
	public void updateEmployee(double sal , int empid) {
		if (isEmpty())
			return;
		else if (head.data.getEmpid() == empid) {
			head.data.setSal(sal);
		} else {
			Node trav = head;
			while (trav != null && trav.data.getEmpid() != empid) {
				trav = trav.next;
			}
			if(trav == null)
				return ;
			trav.data.setSal(sal);
		}
	}


	public boolean isEmpty() {
		return head == null;
	}

}
