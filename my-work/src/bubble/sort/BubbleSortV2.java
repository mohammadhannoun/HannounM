package bubble.sort;

import java.util.Arrays;

public class BubbleSortV2 {
	public static int[] bubbleSort(int[] array) {
		int n = array.length;
		int swp = 0;
		boolean stp = true;
			for(int i = n-1; i >=1&&stp; i--) {
				stp = false;
				for(int j = 0; j < i; j++) {
					if(array[j] > array[j+1]) {
						swp = array[j];
						array[j] = array[j+1];
						array[j+1] = swp;
						stp = true;
					}
				}
			}
			return array;
	}
	public static void main(String[] args) {
		int[] array = {9, 8, 7, 6, 5, 0, 1, 2, 0, 6, 9, 6, 4, 8, 3};
		System.out.println("UnSorted Array: "+Arrays.toString(array));
		array = bubbleSort(array);
		System.out.println("Sorted Array : "+Arrays.toString(array));
	}
}
