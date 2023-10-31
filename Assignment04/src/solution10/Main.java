package solution10;

import java.util.Scanner;

public class Main {
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("***********************************");
		System.out.println("Welcome to JAVA - LAB EXAM");
		System.out.println("0. EXIT");
		System.out.println("1. Add Employee");
		System.out.println("2. Display all Employee");
		System.out.println("3. Search Employee By Name");
		System.out.println("4. Delete employee by empid");
		System.out.println("5. Update salary of employee");
		System.out.print("Please enter your choice : ");
		choice = sc.nextInt(); 
		System.out.println("************************************");
		return choice; 

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		int choice;
		while((choice = menu())!=0)
		{
			switch (choice) {
			case 1:
				Employee emp = new Employee();
				emp.acceptEmployee();
				l1.addLast(emp);
				break;
			case 2:
				l1.display();
				break;
			case 3:
				System.out.print("Enter Name - ");
				String name = sc.nextLine();	
				System.out.println(l1.findEmployee(name));
				break;
			case 4:
				System.out.print("Enter empid - ");
				int empid = sc.nextInt();
				System.out.print("Before :");
				l1.display();
				l1.deleteEmployee(empid);
				System.out.print("After :");
				l1.display();
				break;
			case 5:
				System.out.print("Enter empid - ");
				empid = sc.nextInt();
				System.out.print("Enter Sal - ");
				double sal = sc.nextDouble();
				System.out.print("Before :");
				l1.display();
				l1.updateEmployee(sal , empid);
				System.out.print("After :");
				l1.display();
				break;

			default:
				break;
			}
		}
	}
}
