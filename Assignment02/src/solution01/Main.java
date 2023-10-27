package solution01;

import java.util.Arrays;

public class Main {
	
	public static int selectionSort(int[] arr , int n)
	{
		int count = 0;
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = i+1 ; j< n ; j++)
			{
				count++;
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,67,3,34,9};
		System.out.println(selectionSort(arr, arr.length));
		System.out.println(Arrays.toString(arr));
	}
}
