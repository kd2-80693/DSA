package solution10;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	private int empid;
	private String name;
	private double sal;
	public Employee() {
	}
	public Employee(int empid, String name, double sal) {
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", sal=" + sal + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid;
	}
	
	public void acceptEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter empid - ");
		this.empid = sc.nextInt();	
		sc.nextLine();
		System.out.print("Enter Name - ");
		this.name = sc.nextLine();	
		System.out.print("Enter Salary - ");
		this.sal = sc.nextDouble();
	}
}
