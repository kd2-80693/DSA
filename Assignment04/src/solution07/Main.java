package solution07;


public class Main {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.addLast(1);
		l1.addLast(4);
		l1.addLast(7);
		l1.addLast(5);
		l1.addLast(6);
		l1.addLast(2);
		l1.addLast(3);
		l1.display();
		l1.addAfter(9, 5);
		l1.addBefore(9,1);
		l1.display();
		l1.displayReverse();
		
	}
}
