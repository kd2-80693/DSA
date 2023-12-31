package solution01;

public class Main {
	public static int linearSearch(int[] arr , int key )
	{
		int count = 0 ;
		for(int i = 0 ; i  < arr.length ; i ++ )
		{
			if(arr[i]==key)
			{
				count++;
				return count;
			}
			else
				count++;
		}
		return count ;
	}
	
	
	public static int  binarySearch(int[] arr , int key )
	{
		int count = 0 ;
		int left = 0;
		int right = arr.length-1;
		int mid ;
		while(left <= right)
		{
			count++;
			mid = (left + right) /2 ;
			if(arr[mid] == key)
			{
				return count;
			}
			else if(arr[mid] < key )
			{
				left = mid +1;
		
			}
			else
			{
				right = mid -1;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int count = binarySearch(arr,11);
		System.out.println("comparison = "+ count);
		
	}
}
