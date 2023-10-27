package solution02;

import java.util.Arrays;

public class Main {
	
	public static int bubbleSort(int[] arr , int n) {
		int count = 0;
		boolean flag = false;
		for(int i = 0 ; i< n-1 ; i++)
		{
			flag = true;
			for(int j = 0 ; j < n-i-1 ; j++)
			{
				
				count++;
				if(arr[j] > arr[j+1])
				{
					flag = false;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
				
			}
			if(flag)
			{
				break;
			}
				
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(bubbleSort(arr, arr.length));
		System.out.println(Arrays.toString(arr));
	}
}
