package solution02;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static int linearSearchById(List<Employee> list , Employee key )
	{
		for(int i = 0 ; i  < list.size() ; i ++ )
		{
			if(list.get(i).getEmpid()==key.getEmpid())
			{
				System.out.println("Found at "+ i);
				return i;
			}
		}
		return -1;
	}
	
	public static int  binarySearchById(List<Employee> list , Employee key )
	{
		
		int left = 0;
		int right = list.size()-1;
		int mid ;
		while(left <= right)
		{
			mid = (left + right) /2 ;
			if(list.get(mid).getEmpid()==key.getEmpid())
			{
				System.out.println("Found as " + mid);
				return mid;
			}
			else if(list.get(mid).getEmpid() < key.getEmpid())
			{
				left = mid +1;
			}
			else
			{
				right = mid -1;
			}
		}
		return -1 ;
	}public static int linearSearchByName(List<Employee> list , Employee key )
	{
		for(int i = 0 ; i  < list.size() ; i ++ )
		{
			if(list.get(i).getName().compareTo(key.getName())==0)
			{
				System.out.println("Found at "+ i);
				return i;
			}
		}
		return -1;
	}
	
	public static int  binarySearchByName(List<Employee> list , Employee key )
	{
		
		int left = 0;
		int right = list.size()-1;
		int mid ;
		while(left <= right)
		{
			mid = (left + right) /2 ;
			if(list.get(mid).getName().compareTo(key.getName())==0 )
			{
				System.out.println("Found as " + mid);
				return mid;
			}
			else if(list.get(mid).getName().compareTo(key.getName()) < 0)
			{
				left = mid +1;
			}
			else
			{
				right = mid -1;
			}
		}
		return -1 ;
	}public static int linearSearchBySalary(List<Employee> list , Employee key )
	{
		for(int i = 0 ; i  < list.size() ; i ++ )
		{
			if(list.get(i).getSal()==key.getSal())
			{
				System.out.println("Found at "+ i);
				return i;
			}
		}
		return -1;
	}
	
	public static int  binarySearchBySalary(List<Employee> list , Employee key )
	{
		
		int left = 0;
		int right = list.size()-1;
		int mid ;
		while(left <= right)
		{
			mid = (left + right) /2 ;
			if(list.get(mid).getSal()==key.getSal())
			{
				System.out.println("Found as " + mid);
				return mid;
			}
			else if(list.get(mid).getSal() > key.getSal())
			{
				left = mid +1;
			}
			else
			{
				right = mid -1;
			}
		}
		return -1 ;
	}
	public static void main(String[] args) {
		List<Employee> emp =  new ArrayList<>();
		Employee e1 = new Employee(1,"krit",200);
		Employee e2 = new Employee(2,"krita",203);
		Employee e3 = new Employee(3,"kritb",202);
		Employee e4 = new Employee(4,"kritc",20);
		Employee e5 = new Employee(5,"kritd",220);
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
	
		Employee key = new Employee(6,"kritd",220);
		binarySearchByName(emp, key);
	}
}
