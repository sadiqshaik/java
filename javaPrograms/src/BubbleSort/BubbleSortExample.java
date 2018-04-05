package BubbleSort;

public class BubbleSortExample {
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			/*System.out.println("---------------");
			System.out.println("i " + i);
			System.out.println("---------------");*/
			for (int j = 1; j < (n - i); j++) {
				/*System.out.println("================");
				System.out.println("n-i " + (n - i));
				System.out.println("i " + j);
				System.out.println("================");*/
				if (arr[j - 1] > arr[j]) {
					// swap elements
					/*System.out.println("*********************");
					System.out.println(arr[j - 1] + " arr " + arr[j]);
					System.out.println("*********************")*/;
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		bubbleSort(arr);// sorting array elements using bubble sort

		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}