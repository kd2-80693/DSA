package solution01;

public class Main {
	public static void main(String[] args) {
		DoubleCircularLinkedList l1 = new DoubleCircularLinkedList();
		l1.addAtPos(10, -1);
		l1.addAtPos(20, 1);
		l1.addAtPos(30, 2);
		l1.addAtPos(40, 5);
		l1.fDisplay();
		l1.deleteAtPos(6);
		l1.fDisplay();
	}

}
