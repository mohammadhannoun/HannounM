package merge.sort;

public class PracticeOne {
	public static void main(String[] args) {
		int[] arr= {8, 6, 9, 10, 15, 68, 79, 125, 0, 1};
		System.out.println("Initial Array : ");
		printArray(arr);
		arr= mergeSort(arr);
		System.out.println("Sorted Array : ");
		printArray(arr);
	}
	public static void printArray(int[] arr) {
		for(int j : arr) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	public static int[] mergeSort(int[] arr) {
		if(arr.length<=1) {
			return arr;
		}
		else {
			int midpoint= arr.length/2;
			int[] left= new int[midpoint];
			int[] right= new int[arr.length-midpoint];
				for(int i=0; i<midpoint; i++) {
					left[i]= arr[i];
				}
				for(int j=0; j<right.length; j++) {
					right[j]= arr[midpoint+j];
				}
				int[] result = new int[arr.length];
			left= mergeSort(left);
			right= mergeSort(right);
			result= merge(left, right);
				return result;
		}
	}
	public static int[] merge(int[] left, int[] right) {
		int[] result= new int[left.length+right.length];
		int leftPointer, rightPointer, resultPointer;
		leftPointer= rightPointer= resultPointer= 0;
		while(leftPointer<left.length || rightPointer<right.length) {
			if(leftPointer<left.length&&rightPointer<right.length) {
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
}
