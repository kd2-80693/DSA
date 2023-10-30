package solution05;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		Stack st = new Stack(10);
		for(int i = 0 ; i < arr.length ; i++ )
		{
			st.push(arr[i]);
		}
		System.out.println("Before : " + Arrays.toString(arr));
		for(int i = 0 ; i < arr.length ; i++ )
		{
			arr[i] = st.pop();
		}
		System.out.println("After : " + Arrays.toString(arr));
	}
}
