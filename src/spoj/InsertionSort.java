package spoj;

public class InsertionSort {
	public static void main(String args[]) {
		int[] arr = new int[] { 3, 2, 6, 7, 1 };
		System.out.println("Initial array:");
		for (int element : arr) {
			System.out.print(element + " ,");
		}
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		System.out.println("\nFinal array:");
		for (int element : arr) {
			System.out.print(element + " ,");
		}
	}

}
