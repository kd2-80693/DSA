package solution06;

public class Main {
	public static int rank(int[] arr , int key   )
	{
		int count = 1;
		for(int i = 0 ; i  < arr.length ; i ++ )
		{
			if(arr[i]>key)
				count++;		
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println(rank(arr, 10));
	}
}
