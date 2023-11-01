package solution02;

import java.util.LinkedList;

public class Queue {
	LinkedList<Integer> list = new LinkedList<Integer>();
	private int count = 0;
	private final int SIZE;
	public Queue(int size) {
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
		return list.pollFirst();
	}
	public int peek()
	{
		return list.peekFirst();
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
