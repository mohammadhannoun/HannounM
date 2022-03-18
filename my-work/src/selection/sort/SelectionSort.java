package selection.sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {9, 5, 35, -8, 0, -8, 1, 2};
		arr = selectionSort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] selectionSort(int[] arr) {
		int min, temp;
		for(int i = 0; i < arr.length - 1; i++) {
			min = i; 
			for(int j = i + 1; j < arr.length; j++) { 
				if(arr[min] > arr[j])  min = j;
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
}
