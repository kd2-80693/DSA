package solution03;

import java.util.LinkedList;

public class Deque {
	LinkedList<Integer> list = new LinkedList<Integer>();
	private int count = 0;
	private final int SIZE;

	public Deque(int size) {
		count = 0;
		SIZE = size;
	}

	public void pushFront(int val) {
		count++;
		list.addFirst(val);
	}

	public void pushRear(int val) {
		count++;
		list.addLast(val);
	}

	public int popFront() {
		count--;
		return list.pollFirst();
	}

	public int popRear() {
		count--;
		return list.pollLast();
	}

	public int peekFront() {
		return list.peekFirst();
	}

	public int peekRear() {
		return list.peekLast();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public boolean isFull() {
		return count == SIZE;
	}
}
