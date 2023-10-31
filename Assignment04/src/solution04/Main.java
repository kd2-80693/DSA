package solution04;

public class Main {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.addFirst('C');
		l1.addFirst('d');
		l1.addFirst('e');
		l1.addFirst('f');
		l1.addFirst('g');
		l1.addFirst('h');
		l1.addFirst('i');
		l1.displayList();
		l1.reverse();
		l1.displayList();
	}
}
