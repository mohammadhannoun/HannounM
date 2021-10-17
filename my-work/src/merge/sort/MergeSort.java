package merge.sort;

public class MergeSort {
	public static void printArray(int[] array) {
		for(int i: array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static int[] mergeSort(int[] array) {
		if(array.length<=1) {
			return array;
		}
		int midpoint= array.length/2;
		int[] left= new int[midpoint];
		int[] right;
			if(array.length%2==0) {
				right= new int[midpoint];
			} else {
				right= new int[midpoint+ 1];
			}
				for(int i=0; i<midpoint; i++) {
					left[i]= array[i];
				}
				for(int j=0; j<right.length; j++) {
					right[j]= array[midpoint+j];
				}
		int[] result= new int[array.length];
			left= mergeSort(left);
			right= mergeSort(right);
			result= merge(left, right);
		return result;	
	}
	/*
	 * if(leftPointer<m&&rightPointer<n&&nums1[leftPointer]!=0) {
				if(nums1[leftPointer]<nums2[rightPointer]) {
					nums1[leftPointer]= nums1[leftPointer];
					leftPointer++;
				}
				else {
					swp= nums1[leftPointer];
					nums1[leftPointer]= nums2[rightPointer];
					leftPointer++;
					rightPointer++;
					nums1[leftPointer]= swp;
				}
			}
			else if(leftPointer<m&&nums1[leftPointer]!=0) {
				nums1[leftPointer]= nums1[leftPointer];
				leftPointer++;
			}
			else if(rightPointer<n) {
				nums1[leftPointer]= nums2[rightPointer];
				leftPointer++;
				rightPointer++;
	 */
	public static int[] merge(int[] left, int[] right) {
		int[] result= new int[left.length+right.length];
		int leftPointer, rightPointer, resultPointer;
		leftPointer= rightPointer= resultPointer= 0;
		while(leftPointer<left.length || rightPointer<right.length) {
			if(leftPointer<left.length && rightPointer<right.length) {
				if(left[leftPointer]<right[rightPointer]) {
					result[resultPointer++]= left[leftPointer++];
				}
				else {
					result[resultPointer++]= right[rightPointer++];
				}
			}
			else if(leftPointer<left.length) {
				result[resultPointer++]= left[leftPointer++];
			}
			else if(rightPointer<right.length) {
				result[resultPointer++]= right[rightPointer++];
			}
			
		}
		return result;
	}
	public static void main(String[] args) {
		int[] array= {5, 4, 3, 0, 10, 50, 86};
		System.out.println("Initial Array : ");
		printArray(array);
		
		array= mergeSort(array);
		System.out.println("Sorted Array : ");
		printArray(array);
	}
}
