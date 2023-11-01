package solution03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Deque q = new Deque(4);
		int choice;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"0. Exit\n1. PushFirst\n2. PopFirst\n3. PeekFirst \n4. PushLast\n5. PopLast\n6. PeekLast");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (q.isFull())
					System.out.println("Queue is full");
				else {
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					q.pushFront(data);
				}
				break;
			case 2:
				if (q.isEmpty())
					System.out.println("Queue is Empty");
				else
					q.popFront();
				break;
			case 3:
				if (q.isEmpty())
					System.out.println("Queue is Empty");
				else
					System.out.println("Peeked Data : " + q.peekFront());
				break;
			case 4:
				if (q.isFull())
					System.out.println("Queue is full");
				else {
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					q.pushRear(data);
				}
				break;
			case 5:
				if (q.isEmpty())
					System.out.println("Queue is Empty");
				else
					q.popRear();
				break;
			case 6:
				if (q.isEmpty())
					System.out.println("Queue is Empty");
				else
					System.out.println("Peeked Data : " + q.peekRear());
				break;
			}
		} while (choice != 0);

		sc.close();

	}
}
