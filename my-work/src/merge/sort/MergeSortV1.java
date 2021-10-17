package merge.sort;

public class MergeSortV1 {
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
			int[] left= new int[array.length/2];
			int[] right= new int[array.length-left.length];
				for(int i=0; i<left.length; i++) {
					left[i]= array[i];
				}
				for(int j= 0; j<right.length; j++) {
					right[j]= array[left.length+j];
				}
				int[] result= new int[array.length];
				left= mergeSort(left);
				right= mergeSort(right);
				result= merge(left, right);
		return result;	
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
	public static void main(String[] args) {
		int[] array= {5, 4, 3, 2, 1};
		System.out.println("Initial Array : ");
		printArray(array);
		array= mergeSort(array);
		System.out.println("Sorted Array : ");
		printArray(array);
	}
}
