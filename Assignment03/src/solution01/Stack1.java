package solution01;

public class Stack1 {
	private char arr[];
	private int top;
	private final int SIZE;
	public Stack1(int size) {
		SIZE = size;
		arr = new char[SIZE];
		top = -1;
	}
	
	public void push(char data) {
		//a. reposition the top
		top++;
		//b. add data at top index
		arr[top] = data;
	}
	
	public char pop() {
		//a. read data from top index
		char data = arr[top];
		//b. reposition top
		top--;
		//c. return read data
		return data;
	}
	
	public char peek() {
		//a. read/return data of top index
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE -1;
	}
}
