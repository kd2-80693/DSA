package solution05;

public class Main {
	public static int insertionSort(Employee[] arr, int n) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			count++;
			Employee temp = arr[i];
			int j = i - 1;
			while (j >=0 && arr[j].getSal() > temp.getSal()) {
				
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		return count;
	}

	public static void main(String[] args) {
		Employee[] arr = new Employee[5];
		Employee e1 = new Employee(1,"krit",200);
		Employee e2 = new Employee(2,"krita",203);
		Employee e3 = new Employee(3,"kritb",202);
		Employee e4 = new Employee(4,"kritc",20);
		Employee e5 = new Employee(5,"kritd",220);
		arr[0] = e1;
		arr[1] = e2;
		arr[2] = e3;
		arr[3] = e4;
		arr[4] = e5;
		System.out.println(insertionSort(arr, arr.length));
		for(Employee e : arr)
		System.out.println(e);
	}
}
