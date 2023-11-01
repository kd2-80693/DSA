package solution02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Queue q = new Queue(4);
		int choice;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(q.isFull())
					System.out.println("Queue is full");
				else {
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					q.push(data);
				}
				break;
			case 2:
				if(q.isEmpty())
					System.out.println("Queue is Empty");
				else
					q.pop();
				break;
			case 3:
				if(q.isEmpty())
					System.out.println("Queue is Empty");
				else
					System.out.println("Peeked Data : " + q.peek());
				break;
			}
		}while(choice != 0);
		

		sc.close();

	}
	
	/*public static void main(String[] args) {
		Stack st = new Stack(4);
		int choice;

		Scanner sc  = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				if(st.isFull())
					System.out.println("Stack is full");
				else {
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					st.push(data);
				}
				break;
			case 2:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Poped Data = " + st.pop());
				break;
			case 3:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Peeked Data = " + st.peek());
				break;
			}
		}while(choice != 0);
		
		sc.close();
	}
	*/
}
