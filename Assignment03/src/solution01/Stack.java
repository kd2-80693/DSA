package solution01;

public class Stack {
	
	private final int SIZE;
	private String [] arr;
	private int top;
	
	public Stack(int size) {
		top = -1;
		SIZE = size;
		arr = new String[SIZE];
	}
	
	public void push(String val) {
		top++;
		arr[top] = val;
	}
	public String pop() {
		top--;
		return arr[top+1];
	}
	
	public String  peek() {
		return arr[top];
	}
	
	public boolean isFull() {
		return top == SIZE;
	}
	public boolean isEmpty() {
		return top == -1;
	}

}
