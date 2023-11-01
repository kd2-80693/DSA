package solution04;

public class Main {
	public static void main(String[] args) {
		BinaryTree bst = new BinaryTree();
		
		bst.add(15);
		bst.add(10);
		bst.add(20);
		bst.add(3);
		bst.add(13);
		bst.add(25);
		bst.add(1);
		
		bst.preOrder();

	}
}
