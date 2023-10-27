package solution04;

import java.util.Arrays;

public class Main {
	public static int insertionSort(int[] arr, int n) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			count++;
			int temp = arr[i];
			int j = i - 1;
			while (j >=0 && arr[j] < temp) {
				
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 4,67,3,34,9 };
		System.out.println(insertionSort(arr, arr.length));
		System.out.println(Arrays.toString(arr));
	}
}
