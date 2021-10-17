package bubble.sort;

import java.util.Arrays;

public class BubbleSortRevision3 {
	public static int[] bubbleSort(int[] array) {
		int n= array.length;
		int swp= 0;
		boolean x= true;
			for(int i= n-1; i>=1&&x; i--) {
				for(int j= 0; j<i; j++) {
					x= false;
					if(array[j]>array[j+1]) {
						swp= array[j];
						array[j]= array[j+1];
						array[j+1]= swp;
						x= true;
					}
				}
			}
			return array;
	}
	public static void main(String[] args) {
		int[] array= {5, 8, 1, 7, 10, 2, 0, 1, 2, 1};
		array= bubbleSort(array);
		System.out.println("Sorted Array : "+Arrays.toString(array));
	}
}
