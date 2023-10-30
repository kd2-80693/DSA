package solution06;

public class StackDescending {
	private final int SIZE;
	private int [] arr;
	private int top;
	
	
	public StackDescending(int size) {
		
		SIZE = size;
		arr = new int[SIZE];
		top = SIZE;
	}
	
	public void push(int val) {
		top--;
		arr[top] = val;
	}
	public int pop() {
		top++;
		return arr[top-1];
	}
	
	public int  peek() {
		return arr[top];
	}
	
	public boolean isFull() {
		return top == 0;
	}
	public boolean isEmpty() {
		return top == SIZE;
	}
}
