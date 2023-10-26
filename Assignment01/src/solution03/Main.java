package solution03;

public class Main {
	
	public static int  binarySearch(int[] arr , int key )
	{
		int left = 0;
		int right = arr.length-1;
		int mid ;
		while(left <= right)
		{
			
			mid = (left + right) /2 ;
			if(arr[mid] == key)
			{
				return mid;
			}
			else if(arr[mid] < key )
			{
				right = mid -1;
			}
			else
			{
				left = mid +1;	
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		System.out.println( binarySearch(arr, 10) );
	}
}
