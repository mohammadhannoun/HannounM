package bubble.sort;

import java.util.Arrays;
// program that sorts the array in decending order
public class BubbleSortRevisionV4 {
	public static int[] bubbleSort(int[] array) {
		int len = array.length;
		int swp = 0;
		boolean noswp = true;
			for(int i = len-1; i >=1&&noswp; i--) {
				noswp = false;
				for(int j = 0; j < i; j++) {
					if(array[j] < array[j+1]) {
						swp = array[j];
						array[j] = array[j+1];
						array[j+1] = swp;
						noswp = true;
					}
				}
			}
			return array;
	}
	public static void main(String[] args) {
		int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		System.out.print("The unsorted array = " + Arrays.toString(array));
		array = bubbleSort(array);
		System.out.println();
		System.out.print("The Sorted array = " + Arrays.toString(array));	
	}
}
