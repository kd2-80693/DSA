package solution03;

public class Main {
	public static void main(String[] args) {
		BST bt = new BST();
		bt.add(8);
		bt.add(3);
		bt.add(10);
		bt.add(1);
		bt.add(6);
		bt.add(14);
		bt.add(4);
		bt.add(7);
		bt.add(13);
		bt.preOrder();
		bt.postOrder();
		bt.inOrder();
		bt.countLeaf();
		
	}
}
