package solution02;

import java.util.LinkedList;

public class Stack {
	LinkedList<Integer> list = new LinkedList<Integer>();
	private int count = 0;
	private final int SIZE;
	public Stack(int size) {
		count = 0;
		SIZE = size;
	}
	
	public void push(int val)
	{
		count++;
		list.addLast(val);
	}
	public int pop()
	{
		count--;
		return list.pollLast();
	}
	public int peek()
	{
		return list.peekLast();
	}
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	public boolean isFull()
	{
		return count == SIZE;
	}
	
}
