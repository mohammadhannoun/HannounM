package merge.sort;

import java.util.Arrays;

public class MergeSortV2 {
	public static void main(String[] args) {
		int[] array = {9, 6, 5, 2, 1, 3, 1, 0, 0, 2};
		System.out.println("The Unsorted Array : " + Arrays.toString(array));
		array = mergeSort(array);
		System.out.println("The Sorted Array : " + Arrays.toString(array));
	}
	public static int[] mergeSort(int[] data) {
		int len = data.length;
		if(len == 1) return data;
		int[] left = new int[len/2];
		int[] right = new int[len - left.length];
			for(int i = 0; i < left.length; i++) {
				left[i] = data[i];
			}
			for(int j = 0; j < right.length; j++) {
				right[j] = data[left.length+j];
			}
			int[] result = new int[len];
			left = mergeSort(left);
			right = mergeSort(right);
			result = merge(left, right);
			return result;
	}
	public static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length+right.length];
		int leftPointer, rightPointer, resultPointer;
			leftPointer = rightPointer = resultPointer = 0;
		while(leftPointer < left.length || rightPointer < right.length) {
			if(leftPointer < left.length && rightPointer < right.length) {
				if(left[leftPointer] < right[rightPointer]) {
					result[resultPointer++] = left[leftPointer++];
				}
				else {
					result[resultPointer++] = right[rightPointer++];
				}
			}
			else if(leftPointer < left.length) {
				result[resultPointer++] = left[leftPointer++];
			}
			else if(rightPointer < right.length) {
				result[resultPointer++] = right[rightPointer++];
			}
		}
			return result;
	}
}
